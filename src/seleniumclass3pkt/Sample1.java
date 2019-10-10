package seleniumclass3pkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("http:/www.facebook.com");
		driver.navigate().to("http:/www.gmail.com");
		driver.navigate().to("http:/www.instagram.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().back();
		url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().refresh();
		driver.navigate().forward();
		url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.close();
		driver.quit();
		
		
		

	}

	}