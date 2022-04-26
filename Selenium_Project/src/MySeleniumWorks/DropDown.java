package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.name("fromPort"));
		Select select = new Select(dropDown);
		select.selectByIndex(1);
		Thread.sleep(5000);
		select.selectByVisibleText("Portland");
		Thread.sleep(5000);
		select.selectByValue("New York");
		
	}

}
