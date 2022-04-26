package MySeleniumWorks;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ansala\\eclipse-workspace\\com.groceryAppProject\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		driver.manage().window().maximize();
		

		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of iframes "+iframes.size());
		
		driver.switchTo().frame(0);
		
		WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));
		System.out.println(search.getCssValue("font-family"));
		System.out.println(search.getCssValue("font-size"));
		
		driver.close();
		

	}
}
