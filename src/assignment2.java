import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/"); //Go to cleartrip website
			
		
		Thread.sleep(8000);	
		driver.manage().window().maximize();//to maximize the window
		
		//Select on the calender
		driver.findElement(By.cssSelector("input[placeholder='Pick a date']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		//Select the Adults dropdown
		WebElement staticDropdown=driver.findElement(By.id("Adults"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(4);
		
		
		//Select the children dropdown
		WebElement staticDropdown2=driver.findElement(By.id("Childrens"));
		Select dropdown2=new Select(staticDropdown2);
		dropdown2.selectByIndex(1);
		
		Thread.sleep(2000);	
		
		driver.findElement(By.id("MoreOptionsLink")).click();//click on the more options
		
		
		
		//Select the travel class
		WebElement staticDropdown3=driver.findElement(By.cssSelector(".span.span20"));
		Select dropdown3=new Select(staticDropdown3);
		dropdown3.selectByValue("Business");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");//sendkeys to the input field
		
		driver.findElement(By.id("SearchBtn")).click();
		
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());//will print the error message
		
			
			
		

	}

}
