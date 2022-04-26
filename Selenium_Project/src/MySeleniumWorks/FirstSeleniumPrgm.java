package MySeleniumWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumPrgm {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//driver.close();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ansala\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium.dev/downloads");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		/*
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ansala\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		*/

	}

}
