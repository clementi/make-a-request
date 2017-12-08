-module(main).
-export([main/1]).

main([]) ->
    inets:start(),
    ssl:start(),
    {ok, {{_, 200, _}, _, Body}} =
        httpc:request(get, {"https://httpbin.org/anything", [{"Accept", "application/json"}]}, [], []),
    io:format("~s", [Body]).
