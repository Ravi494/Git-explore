package Day_022_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class TC01_Mouse_Hover_Action3 {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	findElement(By.name("txtUsername")).sendKeys("opensourcecms");
	findElement(By.name("txtPassword")).sendKeys("opensourcecms");
	findElement(By.id("btnLogin")).click();
	

	
	WebElement Admin=findElement(By.xpath("//*[@id='admin']/a/span"));
	WebElement Qualification=findElement(By.xpath("//*[@id='admin']/ul/li[3]/a/span"));
	WebElement Skill=findElement(By.xpath("//*[@id='admin']/ul/li[3]/ul/li[1]/a/span"));

	Actions actions = new Actions(driver);
	 actions.moveToElement(Admin).
	 moveToElement(Qualification).
	 moveToElement(Skill).click().build().perform();
		
	}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
	

}
