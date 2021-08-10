package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Jobs
{
	
	WebDriver driver;
	
	public void Jobs(WebDriver driver1)
	{
		this.driver = driver1;
	}
	
	public  void Addjobs() throws Exception
	{
		
		findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		findElement(By.xpath("//*[@id=\"menu_admin_Job\"]")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.name("jobTitle[jobTitle]")).sendKeys("PrivateJob");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("software eng");
		findElement(By.name("jobTitle[note]")).sendKeys("Note");
		findElement(By.name("btnSave")).click();
		
	
	}
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	

}












