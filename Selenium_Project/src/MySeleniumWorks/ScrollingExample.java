package MySeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingExample {

	public static void main(String[] args) {
		 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/guru99home/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,1000)");        //scroll down
			
			WebElement emailId = driver.findElement(By.id("philadelphia-field-email"));
			//emailId.sendKeys("ansala4lulla@gmail.com");
			
			//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			//js.executeScript("window.scrollBy(0,-1000)");   // scroll up
			
			js.executeScript("arguments[0].scrollIntoView();",emailId);  //To scroll down the web page by the visibility of the element. 
			  
	}

}
