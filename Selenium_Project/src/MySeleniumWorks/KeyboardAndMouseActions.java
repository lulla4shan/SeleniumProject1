package MySeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class KeyboardAndMouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		WebElement agileProject = driver.findElement(By.xpath("//a[text()='Agile Project']"));
		action.contextClick(agileProject).build().perform();  // Mouse right click
		
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.doubleClick(agileProject).build().perform();
		
		
		//action.contextClick(agileProject).build().perform();
		
	
//		WebElement userId=driver.findElement(By.xpath("//input[@name='uid']"));
//		userId.sendKeys("1230");
//	
//		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("1231");
//		
//		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
//		action.sendKeys(login,Keys.ENTER).build().perform();
		
	}

}
