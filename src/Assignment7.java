import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());//print the row
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());//print the column
		
		List<WebElement> abc=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]"));
		
		for(int i=0; i<abc.size();i++)
		{
			String tableContent=abc.get(i).getText();
			System.out.println(tableContent);
			
		}
				
		
		
	}

}
