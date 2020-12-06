package allState;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	@BeforeTest
	public void LoginSite() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://medicalcityhealthcare.com/");
	}
	@Test
	public void LoginButton(){
		driver.findElement(By.xpath("//*[@id=\"header-wrap\"]/div/div[5]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content-main\"]/div[3]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content-main\"]/div[3]/div[2]/div[2]/p[1]/a")).click();
		
		
		
		
		
	}

}
