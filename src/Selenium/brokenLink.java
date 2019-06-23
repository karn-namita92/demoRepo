package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("karn.namita92@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Slowmove@9");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/calendar']")).click();
		
		List<WebElement> allink=driver.findElements(By.tagName("a"));
		allink.addAll(driver.findElements(By.tagName("img")));
		System.out.println("total links are :"+ allink.size());
		
		List<WebElement> activelink=new ArrayList<WebElement>();
         for(int i=0;i<allink.size();i++) {
        	 System.out.println(allink.get(i).getAttribute("href"));
        	 if(allink.get(i).getAttribute("href")!=null && !(allink.get(i).getAttribute("href").contains("javascript"))) {
        		 activelink.add(allink.get(i));
        	 }
        	 
         }
         
         for(int k=0;k<activelink.size();k++) {
		HttpURLConnection con=(HttpURLConnection)new URL(activelink.get(k).getAttribute("href")).openConnection();
		con.connect();
		String res=con.getResponseMessage();				
		con.disconnect();
		System.out.println(activelink.get(k).getAttribute("href")+res);
		

         }
	}
}


