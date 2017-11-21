{-# LANGUAGE OverloadedStrings #-}

module Main where

import Control.Lens
import Network.HTTP.Types.Header
import Network.Wreq
import qualified Data.ByteString.Lazy.Char8 as BL

main :: IO ()
main = do
  let opts = defaults & header hAccept .~ ["application/json"]
  resp <- getWith opts "https://httpbin.org/anything"
  BL.putStrLn $ resp ^. responseBody
