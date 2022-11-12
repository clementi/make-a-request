fn main() -> Result<(), Box<dyn std::error::Error>> {
    let resp = reqwest::blocking::get("https://httpbin.org/anything")?
        .text()?;
    println!("{}", resp);
    Ok(())
}
