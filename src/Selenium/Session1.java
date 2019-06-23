package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class Session1 {

	public static void main(String[] args) {
//System.setProperty("webdriver.gecko.driver", "/home/swetakarn/Downloads/me/geckodriver");
//		WebDriver driver =new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new HtmlUnitDriver();
		
		
		driver.get("https://www.facebook.com/");
	String a=	driver.getTitle();
	System.out.println("page title is: "+a);
	if(a.equals("Facebook – log in or sign up"))
		System.out.println("Pass");
	else
		System.out.println("Fail");
	
	System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());

driver.findElement(By.name("firstname")).sendKeys("sweta");
driver.findElement(By.name("lastname")).sendKeys("karn");

driver.findElement(By.name("reg_email__")).sendKeys("kaarm.sweta@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("Avcs");
driver.findElement(By.name(("reg_email_confirmation__"))).sendKeys("kaarm.sweta@gmail.com");
Select sel=new Select(driver.findElement(By.id("day")));
Select sel1=new Select(driver.findElement(By.id("month")));
Select sel2=new Select(driver.findElement(By.id("year")));


sel.selectByVisibleText("18");
sel1.selectByVisibleText("Oct");
sel2.selectByVisibleText("1992");
//if(driver.findElement(By.id("u_0_9")).isDisplayed()==true)
//driver.findElement(By.name("sex")).click();
//else System.out.println("not available");
WebElement bb= driver.findElement(By.xpath("//input[@name='sex'and @value='2']"));
bb.click();
if(bb.isDisplayed()==true)
	if(bb.isEnabled()==true)
	driver.findElement(By.xpath("//input[@name='sex'and @value='1']")).click();

	}

}