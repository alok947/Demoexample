import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement abc=driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input"));
		abc.click();
		abc.sendKeys("Ind");
		Thread.sleep(3000);
		
		Actions n=new Actions(driver);
		n.moveToElement(driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[2]/div"))).click().build().perform();
				
		
		
		
	}

}
