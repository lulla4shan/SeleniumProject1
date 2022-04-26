package MySeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login-button']"));
		loginButton.click();
	
		Thread.sleep(3000);
		
		WebElement usernameText = driver.findElement(By.cssSelector("a.dropdown-toggle"));
		System.out.println(usernameText.getText());
		
		WebElement welcomeText = driver.findElement(By.xpath("//p[text()='Welcome to Payroll Application']"));
		System.out.println(welcomeText.getText());
		driver.close();

	}
}