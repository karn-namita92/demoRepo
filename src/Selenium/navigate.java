package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
driver.get("https://jqueryui.com/droppable/");
driver.navigate().to("https://www.seleniumhq.org/");
Thread.sleep(1000);


driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);

driver.navigate().back();
Thread.sleep(1000);

driver.navigate().refresh();




	}

}
