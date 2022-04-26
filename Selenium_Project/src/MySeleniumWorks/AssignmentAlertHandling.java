package MySeleniumWorks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
//		WebElement clickMeButton1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
//		clickMeButton1.click();
//		driver.switchTo().alert().accept();
//		
//		
//		WebElement clickMeButton2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
//		clickMeButton2.click();
//		driver.switchTo().alert().accept();
		
		
//		WebElement clickForPromptBoxButton = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
//		clickForPromptBoxButton.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("anslaa");
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		WebElement text =driver.findElement(By.xpath("//p[@id='prompt-demo']"));
//		
//		System.out.println(text.getText());
//		
//		driver.close();
	

		
		
	}

}
