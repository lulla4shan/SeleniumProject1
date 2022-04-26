package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement customerId = driver.findElement(By.name("cusid"));
		customerId.sendKeys("001");
		
		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
		submit.click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		
		
		
	}

}
