package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrip3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naveen\\eclipse-workspace\\SchoolBuilding\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		//WebElement user = driver.findElement(By.name("username"));
		WebElement user1 = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[1].setAttribute('Value', 'Selenium2001')",pass,user1);
		js.executeScript("arguments[0].setAttribute('Value', '20062001')",pass);
		
		Object script = js.executeScript("return arguments[0].getAttribute('Value')",pass);
		System.out.println(script);
		
		//js.executeScript("arguments[0].click()", login);
		WebElement down = driver.findElement(By.linkText("Instagram Lite"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(false)", down);
		
	}
	

}
