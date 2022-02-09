package org.firstfloor;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BSection {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naveen\\eclipse-workspace\\SchoolBuilding\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.instagram.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
			
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("Nanthu");
		
		WebElement user1 = driver.findElement(By.xpath("//input[@type='password']"));
		user.sendKeys("6379668832");
		
		
		Actions acc = new Actions(driver);
		acc.doubleClick(user).build().perform();
		acc.contextClick(user).build().perform();
		
		Robot r = new Robot();
		
		for(int i=0; i <=6; i++) {
        r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    
	    
	}

}