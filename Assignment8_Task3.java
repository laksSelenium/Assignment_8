//Note- Please use only xpath in this scenario
//Open https://www.facebook.com/
//Click on Create new account 
//Fill in all details and click on the Signup button

package assignment_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8_Task3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		// clicking create new account
		driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		Thread.sleep(5000);

		// first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		// last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		// email/phone
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1122334455");
		// password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("TestUser@123");

		// select date
		WebElement dateField = driver.findElement(By.xpath("//select[@id='day']"));
		Select date = new Select(dateField);
		date.selectByVisibleText("17");

		// select month
		WebElement monthField = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(monthField);
		month.selectByValue("6");

		// select month
		WebElement yearField = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yearField);
		year.selectByIndex(15);
		
		//Gender-choose female
		driver.findElement(By.xpath("(//label[text()='Female']//following::input[@name='sex'])[1]")).click();
		
		//signup
		driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']")).click();

	}

}
