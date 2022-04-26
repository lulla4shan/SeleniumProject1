package MySeleniumWorks;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Driver Softwares\\chromedriver_win32-Unzip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		try {
//			driver.get("https://www.iana.org/domains/reserved");
//			driver.manage().addCookie(new Cookie("key", "value"));
//		}
//		finally {
//            driver.quit();
//        }
		
		
		
		/* get cookie name */
		
//		try {
//            driver.get("https://www.iana.org/domains/reserved");
//            driver.manage().addCookie(new Cookie("foo", "bar"));
//
//            // Get cookie details with named cookie 'foo'
//            Cookie cookie1 = driver.manage().getCookieNamed("foo");
//            System.out.println(cookie1);
//        } finally {
//            driver.quit();
//        }

	}

}
