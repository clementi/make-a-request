defmodule Elixirhttp do
  def start(_type, _args) do
    response = HTTPotion.get "httpbin.org/anything", headers: ["Accept": "application/json"]
    IO.puts response.body

    Supervisor.start_link [], strategy: :one_for_one
  end
end
