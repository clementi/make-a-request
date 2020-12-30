use hyper::Body;
use hyper::Request;
use hyper::{body::HttpBody as _, Client};
use tokio::io::{self, AsyncWriteExt};

type Result<T> = std::result::Result<T, Box<dyn std::error::Error + Send + Sync>>;

#[tokio::main]
async fn main() -> Result<()> {
    let request = Request::builder()
        .uri("http://httpbin.org/anything")
        .header("Accept", "application/json")
        .body(Body::default())?;

    let client = Client::new();
    let mut response = client.request(request).await?;

    while let Some(next) = response.data().await {
        let chunk = next?;
        io::stdout().write_all(&chunk).await?;
    }

    Ok(())
}
