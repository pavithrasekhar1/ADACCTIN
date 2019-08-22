package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass1 {
	static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\eclipse-committers-2019-03-R-win32-x86_64\\eclipse\\May30\\Pom\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
	public static void loadurl(String url) {
		driver.get(url);
	}
	
public static void type(WebElement element, String name) {
	element.sendKeys(name);
}
public static void btnclick(WebElement element) {
	element.click();
}
public static void quitbrowser() {
	driver.quit();
}

public static void text(WebElement element,String text) {
    element.getText(text);
    }
   public static void value(WebElement element,String attribute){
    element.get(attribute);
    }
    public static void title( WebDriver driver,String title){
        driver.get(title);
}
}