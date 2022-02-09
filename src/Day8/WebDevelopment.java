package Day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDevelopment {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\naveen\\\\eclipse-workspace\\\\SchoolBuilding\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		for(int i = 0; i < iTable.size(); i++) {
			WebElement table = iTable.get(i);
			WebElement body = table.findElement(By.tagName("tbody"));
			List<WebElement> iRow = body.findElements(By.tagName("tr"));
		for(int j = 0; j < iRow.size(); j++) {
		     WebElement row = iRow.get(j);
	         List<WebElement> iData = row.findElements(By.tagName("td"));
		for(int k = 0; k < iData.size(); k++) {
			WebElement data = iData.get(k);
				String text = data.getText();
				System.out.println("Table['"+i+"'] :"+text);
				
			}
				
				
			}
			
			
		}
		
	}
}
