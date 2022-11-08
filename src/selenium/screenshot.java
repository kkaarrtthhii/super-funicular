package selenium;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthick\\eclipse-workspace\\selenium_karthick\\driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.flipkart.com/");
	TakesScreenshot ts = (TakesScreenshot) dr;
	File screen = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Karthick\\eclipse-workspace\\selenium_karthick\\screen\\home.png");
	FileHandler.copy(screen,destination);
	
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
