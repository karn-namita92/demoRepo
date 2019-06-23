package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class windowHandler {

	public static void main(String[] args) throws InterruptedException {
		String windw;

		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	Set<String>handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();		
	String win1=	it.next();
		System.out.println("Window1= "+win1);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		String win2= it.next();
		System.out.println("window2= "+win2);
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	    String win3= it.next();
		System.out.println("window3= "+win3);
		driver.switchTo().window(win3);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
