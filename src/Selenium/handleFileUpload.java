package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("/home/swetakarn/Pictures/image64-616x435.jpg");
		driver.findElement(By.xpath("//button[@id='submitbutton'and @name='send']")).click();
		String abb=driver.findElement(By.className("demo")).getText();
		System.out.println(abb);
	}

}
