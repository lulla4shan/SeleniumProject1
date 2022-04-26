package MySeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Grocery7Mart {
	

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.gecko.driver", "D:\\Selenium Driver Softwares\\geckodriver-v0.30.0-win64-Unzip\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("admin");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkbox =driver.findElement(By.xpath("//label[@for='remember']"));
		//checkbox.click();
		Boolean selected = checkbox.isSelected();
		System.out.println(selected);
		WebElement login = driver.findElement(By.xpath("//button[text()='Sign In']"));
		login.click();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().dismiss();
		
		
		
		
		
//		WebElement manageOrder = driver.findElement(By.xpath("(//a[@href='http://groceryapp.uniqassosiates.com/admin/list-order'])[1]"));
//		manageOrder.click();
//		WebElement delete = driver.findElement(By.xpath("//a[@href='http://groceryapp.uniqassosiates.com/admin/Order/delete?del=494&page_ad=1']"));
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(delete));
//		delete.click();
//		driver.switchTo().alert().accept();
//		WebElement text = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
//		System.out.println(text);
		//driver.close();
	}

}
