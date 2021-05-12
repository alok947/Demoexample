import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mediumAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://medium.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.cssSelector("div[id*='email']")).click();
		driver.findElement(By.cssSelector("input[aria-label*='email']")).sendKeys("astrologyexpert@gmail.com");
		driver.findElement(By.linkText("Continue")).click();


		
		
		
	}

}
