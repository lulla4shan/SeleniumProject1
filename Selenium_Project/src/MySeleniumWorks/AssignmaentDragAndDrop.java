package MySeleniumWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmaentDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement drag1 = driver.findElement(By.xpath("(//*[@class='button button-orange'])[2]"));
		WebElement drop = driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
		action.dragAndDrop(drag1, drop).perform();
		

	}

}
