import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class myWebsiteauto {

	private static Logger log=LogManager.getLogger(myWebsiteauto.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Contact Us")).click();
		log.debug("Contect Us button clicked");		
		
		driver.findElement(By.id("username")).sendKeys("My name is Ankush");
		log.info("User name is given");
		
		driver.findElement(By.id("mobileno")).sendKeys("101450");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Japan");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Select subject=new Select(driver.findElement(By.cssSelector("select[id='subject']")));
		subject.selectByVisibleText("Online Courses");
		driver.findElement(By.cssSelector("textarea[id='message']")).sendKeys("Hi sir, This is my first automation testing");

		log.error("Can not click on the send button");
		log.fatal("This is critical");
		driver.close();
		
		
	}

}
