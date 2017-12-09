defmodule ElixirhttpTest do
  use ExUnit.Case
  doctest Elixirhttp

  test "greets the world" do
    assert Elixirhttp.hello() == :world
  end
end
