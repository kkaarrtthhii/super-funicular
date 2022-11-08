package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class kai {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthick\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	
}
}
