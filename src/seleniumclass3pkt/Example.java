package seleniumclass3pkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
	
	@Test
	public void myTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		List<WebElement> noOfAdd= driver.findElements(By.xpath("(//div[@class='slick-track'])[1]/descendant::div/descendant::img"));
		for(int i=0;i<noOfAdd.size();i++) {
			System.out.println(noOfAdd.get(i).getAttribute("src"));
			if("https://www.irctctourism.com/packageImage/home_page_image/16.jpg".equals(noOfAdd.get(i).getAttribute("src"))) {
				noOfAdd.get(i).click();
			}
		}
	}

}
