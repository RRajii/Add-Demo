class DisplayOverloading2
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
		"C:/Users/siva/workspace/Selenium/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		String s =
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(s);
		}
}