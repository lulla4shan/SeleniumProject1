package MySeleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleForCheckBoxAndRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ansala\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement checkBoxDemo = driver.findElement(By.xpath("//a[contains(text(),'Checkbox Demo')]"));
		checkBoxDemo.click();
		WebElement selectAllButton = driver.findElement(By.id("button-two"));
		selectAllButton.click();
		WebElement checkBoxOne = driver.findElement(By.id("check-box-one"));
		System.out.println(checkBoxOne.isSelected());
		WebElement checkBoxTwo = driver.findElement(By.id("check-box-two"));
		System.out.println(checkBoxTwo.isSelected());
		WebElement checkBoxThree = driver.findElement(By.id("check-box-three"));
		System.out.println(checkBoxThree.isSelected());
		WebElement checkBoxFour = driver.findElement(By.id("check-box-four"));
		System.out.println(checkBoxFour.isSelected());
		WebElement radioButtonsDemo = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioButtonsDemo.click();
		WebElement maleRadioBtn = driver.findElement(By.id("inlineRadio11"));
		maleRadioBtn.click();
		System.out.println(maleRadioBtn.isSelected());
		WebElement ageRadioBtn = driver.findElement(By.id("inlineRadio22"));
		ageRadioBtn.click();
		System.out.println(ageRadioBtn.isSelected());
	
		driver.close();
	}
}
