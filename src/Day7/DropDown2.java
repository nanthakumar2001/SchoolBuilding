package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\naveen\\\\eclipse-workspace\\\\SchoolBuilding\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement user = driver.findElement(By.tagName("select"));
		
		Select s = new Select(user);
		boolean multible = s.isMultiple();
		System.out.println(multible);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
		WebElement element = options.get(i);
		String text = element.getText();
		System.out.println(text);
		}
		
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		
		for (int j = 0; j < selectedOptions.size(); j++) {
		WebElement element = selectedOptions.get(j);
		String text = element.getText();
		System.out.println("Selected Option List = "+text);
		}
		
		WebElement option = s.getFirstSelectedOption();
		String text = option.getText();
		System.out.println(text);
		
	}
}
