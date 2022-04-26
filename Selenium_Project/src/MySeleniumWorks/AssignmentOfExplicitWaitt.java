package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentOfExplicitWaitt {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qabible.in/payrollapp/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li//a[text()='Clients']")));
		WebElement clientsTabOnHomePage = driver.findElement(By.xpath("//li//a[text()='Clients']"));
		clientsTabOnHomePage.click();
		WebElement clientTab2 = driver.findElement(By.xpath("//li[@class='active'][1]"));
		System.out.println(clientTab2.getAttribute("class"));
		WebDriverWait waitForSearch = new WebDriverWait(driver,10);
		waitForSearch.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Search']")));
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		System.out.println(search.getText());
		WebDriverWait waitForReset = new WebDriverWait(driver,10);
		waitForReset.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-default']")));
		WebElement timeSheet = driver.findElement(By.xpath("//a[text()='TimeSheet']"));
		timeSheet.click();
		WebDriverWait waitAlert = new WebDriverWait(driver,10);
		waitAlert.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Generate Playslip']")));
		WebElement generatePaySlip = driver.findElement(By.xpath("//button[text()='Generate Playslip']"));
		generatePaySlip.click();
		driver.switchTo().alert().accept();		
	}
}
