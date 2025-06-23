import aiohttp
import asyncio


async def main():
    url = 'https://httpbin.org/anything'
    headers = {'Accept': 'application/json'}

    async with aiohttp.ClientSession() as session:
        async with session.get(url, headers=headers) as response:
            text = await response.text()
            print(text)


asyncio.run(main())
