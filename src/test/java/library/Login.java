package library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test 
public class Login {
	WebDriver driver ;
	
	public void DriverLaunch() {
		driver = new ChromeDriver();
	}
     public void navigation() {
    	 driver.get("https://rf2.ilabx.com");
 		driver.manage().window().maximize();
 		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
 		driver.findElement(By.id("password_input")).sendKeys("Adm!n987");
 		driver.findElement(By.id("login_btn")).click();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 		driver.get("https://rf2.ilabx.com/sc/344/electron-microscopy-facility/?tab=requests");
     }
     
}
