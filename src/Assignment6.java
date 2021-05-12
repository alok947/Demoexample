import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bapun\\Desktop\\Important Selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Select the 3rd option from the checkbox and grab the text
		driver.findElement(By.id("checkBoxOption3")).click();
		String abc=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		System.out.println(abc);
		
		//Select the dropdown as per the grabbed text
		WebElement dropdown=driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select dropvalue=new Select(dropdown);
		dropvalue.selectByVisibleText(abc);
		
		//Enter the Grabbed text value in the input box
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(abc);
		driver.findElement(By.cssSelector("#alertbtn")).click(); //click on the alert button
		
		//Handle the alert and check the grabbed text is present in the alert or not
		String[] message=driver.switchTo().alert().getText().split(",");
		String[] newmessage=message[0].split(" ");
		
		if(newmessage[1].equals(abc))
		{
			System.out.println("The String is present in the alert");
		}
		else
			System.out.println("The value is not present in the alert");
		
					
		
		
	}

}
