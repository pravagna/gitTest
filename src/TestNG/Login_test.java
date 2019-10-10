package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_test {
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
		
	}
	@Test(priority=1)
	public void loadpage()
	{
		driver.get("http:/www.facebook.com");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	@Test(dependsOnMethods= "loadpage")
	public void filloutemailfid()
	{
		String Email="pravagnajana@gmail.com";
		WebElement emailfid=driver.findElement(By.id("u_0_r"));
		emailfid.sendKeys(Email);
		Assert.assertEquals(emailfid.getAttribute("value"), Email);
		
				
		
	}

}
