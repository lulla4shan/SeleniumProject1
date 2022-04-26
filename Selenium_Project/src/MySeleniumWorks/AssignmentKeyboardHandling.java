package MySeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentKeyboardHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement enterMessage = driver.findElement(By.xpath("//*[@id='single-input-field']"));
		action.doubleClick(enterMessage).build().perform();
		
		enterMessage.sendKeys("Welcome to selenium class..",Keys.TAB);
		//action.sendKeys(Keys.TAB).perform();
		
		WebElement showMsg = driver.findElement(By.xpath("//*[@id='button-one']"));
		showMsg.click();
		action.sendKeys(showMsg,Keys.ENTER).perform();
		
		WebElement msg = driver.findElement(By.xpath("//*[starts-with(text(),'Your Message : ')]"));
		System.out.println(msg.getText());
		
		//driver.quit();

	}

}
