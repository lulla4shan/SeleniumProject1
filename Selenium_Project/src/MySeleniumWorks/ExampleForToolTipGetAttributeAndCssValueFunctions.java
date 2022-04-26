package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleForToolTipGetAttributeAndCssValueFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement covid19InformationTooltip = driver.findElement(By.xpath("//a[@id='Covid19info']"));
		System.out.println("Covid 19 Information Tooltip = "+covid19InformationTooltip.getAttribute("title"));
		
		WebElement flightStatusTooltip = driver.findElement(By.xpath("//a[@href='https://book.spicejet.com/Search.aspx?op=3']"));
		System.out.println("Flight Status Tooltip = "+flightStatusTooltip.getAttribute("title"));
		
		WebElement roundTrip = driver.findElement(By.xpath("//label[text()='Round Trip']"));
		System.out.println("Font type of Round trip Radio button is "+roundTrip.getCssValue("font-family"));
		System.out.println("Font size Round trip Radio button is "+roundTrip.getCssValue("font-size"));
		System.out.println("Font color Round trip Radio button is "+roundTrip.getCssValue("color"));
		
		WebElement searchBtn =driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		System.out.println("Search button background color is "+searchBtn.getCssValue("background-color"));
		
		WebElement manageBooking = driver.findElement(By.xpath("//span[text()='Manage Booking']"));
		System.out.println("Font type of Manage Booking is "+manageBooking.getCssValue("font-family"));
		System.out.println("Font size of Manage Booking is "+manageBooking.getCssValue("font-size"));
		
		driver.close();
	}

}
