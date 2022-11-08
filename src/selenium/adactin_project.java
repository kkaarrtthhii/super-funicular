package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin_project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthick\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Karthickabi123");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("karthiabi321");
		WebElement findElement3 = driver.findElement(By.id("login"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//select[@name='location']"));
		Select q = new Select(findElement4);
		q.selectByVisibleText("Los Angeles");
		WebElement findElement5 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select w = new Select(findElement5);
		w.selectByVisibleText("Hotel Sunshine");
		WebElement findElement6 = driver.findElement(By.id("room_type"));
		Select r = new Select(findElement6);
		r.selectByVisibleText("Deluxe");
		WebElement findElement7 = driver.findElement(By.id("room_nos"));
		Select e = new Select(findElement7);
		e.selectByIndex(3);
		Thread.sleep(2000);
		WebElement findElement8 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		findElement8.sendKeys("14/10/2022");
		WebElement findElement9 = driver.findElement(By.id("datepick_out"));
		findElement9.sendKeys("15/10/2022");
		WebElement findElement10 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select u = new Select(findElement10);
		u.selectByValue("2");
		WebElement findElement11 = driver.findElement(By.id("child_room"));
		Select i = new Select(findElement11);
		i.selectByIndex(1);
		WebElement findElement12 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement12.click();
		
	}

}
