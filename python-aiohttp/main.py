import aiohttp
import asyncio
import async_timeout


async def main():
    url = 'https://httpbin.org/anything'
    headers = {'Accept': 'application/json'}

    async with aiohttp.ClientSession() as session:
        with async_timeout.timeout(10):
            async with session.get(url, headers=headers) as response:
                text = await response.text()
                print(text)


loop = asyncio.get_event_loop()
loop.run_until_complete(main())
