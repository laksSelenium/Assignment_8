//Note- Please use only css in this scenario
//Open https://www.facebook.com/
//Click on Create new account 
//Fill in all details and click on the Signup button

package assignment_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8_Task4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		// clicking create new account
		driver.findElement(By.cssSelector("a[data-testid*=\"open-registration\"]")).click();
		Thread.sleep(5000);

		// first name
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Test");
		// last name
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("User");
		// email/phone
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("1122334455");
		// password
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("TestUser@123");

		// select date
		WebElement dateField = driver.findElement(By.cssSelector("select[id='day']"));
		Select date = new Select(dateField);
		date.selectByVisibleText("17");

		// select month
		WebElement monthField = driver.findElement(By.cssSelector("select[id='month']"));
		Select month = new Select(monthField);
		month.selectByValue("6");

		// select month
		WebElement yearField = driver.findElement(By.cssSelector("select[id='year']"));
		Select year = new Select(yearField);
		year.selectByIndex(15);
		
		//Gender-choose female
		driver.findElement(By.cssSelector("input[value='1']")).click();
		
		//signup
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();

	}

}
