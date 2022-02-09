package Day7;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\naveen\\\\eclipse-workspace\\\\SchoolBuilding\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement user = driver.findElement(By.tagName("select"));
		
		Select s = new Select(user);
		s.selectByIndex(5);
		
		s.selectByValue("INDIA");
		
		s.selectByVisibleText("ITALY");
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
		WebElement element = options.get(i);
		String Text = element.getText();
		System.out.println(Text);
		
	}
	
	}
}
