import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lastexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Clicks the Home link on the 1st page
		String newTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Home")).sendKeys(newTab);
		
		//move the driver execution to the second page
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String firstPage=it.next();
		String secondPage=it.next();
		driver.switchTo().window(secondPage);
		
		String course=driver.findElement(By.xpath("//h2/a")).getText();
		
		driver.switchTo().window(firstPage);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(course);
		
		//For Taking Screenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Bapun\\Desktop\\Important Selenium files\\screenshot.png"));
		
		//For scrolling down
		JavascriptExecutor scroll= (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,1000)");
		
	
		
		
		
		
	}

}
