//Open ​​https://www.facebook.com/ 
//Capture all link text available in the footer section and verify Create Page Link is present or not. If yes then click on it.

package assignment_8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@id='pageFooter']//a"));
		for (WebElement link : footerLinks) {
			String linkHref = link.getAttribute("href");
			String linkText = link.getText();
			if (linkHref != null) {
				System.out.println("Printing all footer links having href");
				System.out.println(linkHref);
				System.out.println(linkText);
				System.out.println("=============");
			}
		}

		for (byte i = 0; i < footerLinks.size(); i++) {
			String linkHref = footerLinks.get(i).getAttribute("href");
			String linkText = footerLinks.get(i).getText();
			if ((linkHref != null) && (linkText.contains("Create Page"))) {
				System.out.println("Found create page link and hence can click on it");
				footerLinks.get(i).click();
				break;
			}

		}

		driver.quit();

	}

}
