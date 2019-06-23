package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamoXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		List<WebElement> ls=driver.findElements(By.xpath("//ul[@role='listbox']//descendant::div[@class='sbtc']"));
		
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i).getText());
			if(ls.get(i).getText().equals("javatpoint")) {
				ls.get(i).click();
			break;
			}
			
		}		
		Thread.sleep(2000);
		driver.close();
	}

}
