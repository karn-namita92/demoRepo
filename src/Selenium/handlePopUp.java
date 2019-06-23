package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlePopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(50);

		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(50);
		alert1.accept();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		driver.quit();
		
		
		
	}

}
