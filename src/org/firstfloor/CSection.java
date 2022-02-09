package org.firstfloor;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSection {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naveen\\eclipse-workspace\\SchoolBuilding\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/drag_drop.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')] "));
		WebElement drop = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[1]"));
		
		WebElement drag1 = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[2]"));
		
		WebElement drag2 = driver.findElement(By.xpath(" //a[contains(text(),'SALES')]"));
		WebElement drop2 = driver.findElement(By.xpath(" (//li[contains(@class,'placeholder')])[3]"));
		
		WebElement drag3 = driver.findElement(By.xpath(" (//a[contains(text(),'5000')])[4]"));
		WebElement drop3 = driver.findElement(By.xpath(" (//li[contains(@class,'placeholder')])[4]"));
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(drag,drop).build().perform();
		acc.dragAndDrop(drag1,drop1).build().perform();
		acc.dragAndDrop(drag2,drop2).build().perform();
		acc.dragAndDrop(drag3,drop3).build().perform();
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec = new File("C:\\Users\\naveen\\eclipse-workspace\\SchoolBuilding\\Driver\\Selenium");
		FileUtils.copyFile(src, dec);
		
		
		
		
		
	}

}
