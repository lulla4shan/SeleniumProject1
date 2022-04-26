package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOfTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qabible.in/payrollapp/client/index");
		driver.manage().window().maximize();
		
		WebElement tableHeading1 = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']//th[1]//a"));
		System.out.println(tableHeading1.getText());
		
	
		
		driver.close();
	}

}
