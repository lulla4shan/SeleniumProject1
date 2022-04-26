package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement familyAndFriendCheckBox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		familyAndFriendCheckBox.click();
		System.out.println(familyAndFriendCheckBox.isSelected());
		
		
		WebElement oneWayRadioButton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		oneWayRadioButton.click();
		System.out.println(oneWayRadioButton.isSelected());
		
		
		driver.close();
		
	}

}
