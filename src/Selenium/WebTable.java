package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	public static void mark1(WebElement aa1, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid black;');", aa1);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karn.namita92@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Slowmove@9");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//td[contains(text(),'abc sharma')]//parent::td//preceding-sibling::td")).click();*/
//	String a=	driver.findElement(By.xpath("//td[contains(text(),'con2 shrivastava')]")).getText();
//	System.out.println(a);
		
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.navigate().refresh();
		WebElement aa= driver.findElement(By.xpath("//*[contains(text(),'Shah')]//parent::div//following-sibling::div/following-sibling::div/descendant::div//button[@style='padding:2px 7px;background-color:#4caeea']"));
//mark1(aa,driver);
		
//		WebElement aa=driver.findElement(By.xpath("//*[@id=\"1560669068778-0-uiGrid-000B-cell\"]/user-click-select/div[1]/button"));
		Actions ac=new Actions(driver);
		ac.doubleClick(aa);
		ac.doubleClick();
		
		
		
	}

}
