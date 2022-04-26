package MySeleniumWorks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qabible.in/payrollapp/");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();
		
		
		
		//Explicit wait
		
		WebDriverWait explicitWait = new WebDriverWait(driver,10);
		 
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.className("dropdown-toggle")));
//		
//		
		WebElement name = driver.findElement(By.className("dropdown-toggle"));
		System.out.println(name.getText());
		
//		WebDriverWait explicitWait = new WebDriverWait(driver,10);		 
//		WebElement name = explicitWait.until(ExpectedConditions.elementToBeClickable(By.className("dropdown-toggle")));
		name.click();
		
		
		//fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30))		
				.pollingEvery(Duration.ofSeconds(5))		
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[starts-with(text(),'view full')]")));
		WebElement viewFullProfile = driver.findElement(By.xpath("//a[starts-with(text(),'view full')]"));
		viewFullProfile.click();
		
		//driver.close();
	}

}
