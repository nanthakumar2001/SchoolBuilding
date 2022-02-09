package org.firstfloor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ASection {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\naveen\\eclipse-workspace\\SchoolBuilding\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Nanthu");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("20062001");
		
		//String attribute = password.getAttribute("value");
		//System.out.println(attribute);
		
		//WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		

	}




}
