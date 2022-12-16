//Open ​​https://www.facebook.com/
//Capture the below text and verify text contains the below text
//Facebook helps you connect and share with the people in your life

package assignment_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_Task1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		WebElement fbText = driver.findElement(By
				.xpath("//h2[normalize-space()='Facebook helps you connect and share with the people in your life.']"));
		String actualText = fbText.getText();
		System.out.println(actualText);
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("Facebook shows the expected text");
		}

		// or
		boolean fbTextStatus = fbText.isDisplayed();
		if ((fbTextStatus) && (actualText.equalsIgnoreCase(expectedText))) {
			System.out.println("Facebook shows the expected text");
		}
		
		driver.quit();

	}

}
