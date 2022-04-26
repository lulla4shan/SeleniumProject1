package MySeleniumWorks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window handle : "+parentWindow);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement openNewWindowBtn = driver.findElement(By.id("newWindowBtn"));
		js.executeScript("arguments[0].scrollIntoView();", openNewWindowBtn);
		openNewWindowBtn.click();
		
		WebElement openNewTabBtn = driver.findElement(By.id("newTabBtn"));
		js.executeScript("arguments[0].scrollIntoView();",openNewTabBtn);
		openNewTabBtn.click();
		
		Set<String> allChildWindows = driver.getWindowHandles(); // All child windows are stored in a set of strings.
		System.out.println(allChildWindows);
		
		Iterator<String> iterator = allChildWindows.iterator(); // Here we will iterate through all child windows.
		while(iterator.hasNext())
		{
			String childWindow = iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				driver.manage().window().maximize();
				WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
				firstName.sendKeys("ansala");
				
				driver.close();
				
				
			}
			String childWindow1 = iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow1)) {
				driver.switchTo().window(childWindow1);
				
				
				WebElement home = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
				home.click();
				
				driver.close();
				
				
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
		
	
	
