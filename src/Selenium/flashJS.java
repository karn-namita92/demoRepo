package Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flashJS {

	flashJS() throws IOException {
		super();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		WebElement aa= driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a"));
		/*flash(aa,driver);
		Thread.sleep(1000);
		mark(aa,driver);
		Thread.sleep(1000);

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/home/swetakarn/RecentAutomationWS/SeleniumSession/src/Selenium/ScreenShots/shot2.jpeg"));
		alert("Please change the job!",driver);*/
		click(aa,driver);
	}
		
		
		public static void flash(WebElement aa1, WebDriver driver) throws InterruptedException {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String bgcolour=aa1.getAttribute("background");
			for(int i=0;i<2;i++) {
			js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid black;');", aa1);
			Thread.sleep(1000);

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid black;');", aa1);
			Thread.sleep(1000);
			}
			Thread.sleep(1000);
			System.out.println("Changing back to original colour");
			js.executeScript("arguments[0].setAttribute('style', 'background: "+bgcolour+";"+"');", aa1);
			
		try {
			
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
public static void mark(WebElement aa1, WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid black;');", aa1);
}
public static void alert(String msg, WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('"+msg+"')");
	
}
public static void click(WebElement aa1, WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",aa1);
	
}




}
