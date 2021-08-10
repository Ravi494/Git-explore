package  Day_004_Dropdown;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.*;
//import org.openqa.selenium.support.ui.*;

public class Listbox2
{
	
	//Test1 will be executed driver
	static WebDriver driver;
	
	

	@Test
	public void Test1() throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		String TestURL = "https://mdbootstrap.com/docs/jquery/forms/multiselect/";
		driver.get(TestURL);
		
		
		List<WebElement> links=  driver.findElements(By.xpath("//*[@id='introduction']/div[1]/div[1]/section[1]/select"));
		int links_count= links.size();
		System.out.println("Number of hyperlinks "+links_count);
	
//driver.findElement(By.xpath("//*[@id='introduction']/div[1]/div[1]/section[1]/select/option[1]")).click();		
driver.findElement(By.xpath("//*[@id='introduction']/div[1]/div[1]/section[1]/select/option[2]")).click();
driver.findElement(By.xpath("//*[@id='introduction']/div[1]/div[1]/section[1]/select/option[3]")).click();


	}
	


	
	
	
	
}



