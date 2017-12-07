-module(main).
-export([main/0]).

main() ->
    inets:start(),
    ssl:start(),
    {ok, {{Version, 200, ReasonPhrase}, Headers, Body}} = httpc:request(get, {"https://httpbin.org/anything", [{"Accept", "application/json"}]}, [], []),
    io:format("~s", [Body]).
