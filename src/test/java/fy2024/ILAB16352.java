package fy2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ILAB16352 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Login to application 
		driver.get("https://rf2.ilabx.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm!n987");
		driver.findElement(By.id("login_btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rf2.ilabx.com/sc/344/electron-microscopy-facility/?tab=requests");
		driver.findElement(By.id("equipment_button")).click();
		driver.findElement(By.xpath("//a[@id='schedule_button_91324']")).click();
		
		WebElement a = driver.findElement(By.xpath("//*[@id='scheduler_here']/div[4]/div[8]/div[3]"));
		
		Actions act= new Actions(driver);
		act.doubleClick(a).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='ui selection dropdown no_auto_init']")).click();
		act.sendKeys(Keys.DOWN).build().perform();
		driver.findElement(By.xpath("//*[@id='schedule_select_user_modal']/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='service_event_save_button']")).click();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile=new File("C:\\Users\\vishgarg\\OneDrive - Agilent Technologies\\Desktop\\Selenium\\Maintainace.png");
		 FileUtils.copyFile(SrcFile, DestFile);
		 Thread.sleep(2000);
		 
		 driver.close();
		
		
		
		

	}

}
