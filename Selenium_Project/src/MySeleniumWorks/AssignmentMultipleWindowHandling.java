package MySeleniumWorks;

/* URL : http://demo.guru99.com/popup.php 
	1. Navigate to the URL & "Click Here" link. 
	2. Switch the window --> Enter email id & click submit. 
	3. Switch back to the main window.  */

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allWindowsOpened = driver.getWindowHandles();
		System.out.println(allWindowsOpened);
		
		Iterator<String> iterator = allWindowsOpened.iterator();
		while(iterator.hasNext()) {
			String emailIdPage = iterator.next();
			if(!parentWindow.equalsIgnoreCase(emailIdPage)) {
				driver.switchTo().window(emailIdPage);
				WebElement emailId = driver.findElement(By.name("emailid"));
				emailId.sendKeys("ansala4lulla@gmail.com");
				WebElement submitButton = driver.findElement(By.name("btnLogin"));
				submitButton.click();	
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.quit();
	}
}
