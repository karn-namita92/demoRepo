package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readProperties {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/home/swetakarn/Downloads/me/chromedriver");
		WebDriver driver=new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip=new FileInputStream("/home/swetakarn/RecentAutomationWS/SeleniumSession/src/Selenium/config.properties");
		prop.load(ip);
		driver.get(prop.getProperty("url"));
		
		
	}

}
