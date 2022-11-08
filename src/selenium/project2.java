package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthick\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
}
}
