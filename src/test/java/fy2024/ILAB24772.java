package fy2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILAB24772 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		// Login to application 
		driver.get("https://rf2.ilabx.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm!n987");
		driver.findElement(By.id("login_btn")).click();
		driver.findElement(By.id("hamburger")).click();
		
		
		

	}

}
