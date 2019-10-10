package seleniumclass3pkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	private static final boolean WebElement = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.findElement(By.xpath("//*[@id=\'u_0_9\']/div[6]/a")).click();
		WebElement element=driver.findElement(By.id("month"));
		Select Month_Dropdown=new Select(element);
		
		
		WebElement Result=Month_Dropdown.getFirstSelectedOption();
		System.out.println(Result.getText());
		
	List<WebElement> Months=Month_Dropdown.getOptions();
	System.out.println(Months.size());
	for(WebElement ele:Months)
	{
		String Name_Month=ele.getText();
		System.out.println(Name_Month);
		
	}
	
	
		
		
		
	}

}
