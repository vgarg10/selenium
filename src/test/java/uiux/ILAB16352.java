package uiux;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
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
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rf2.ilabx.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm!n987");
		driver.findElement(By.id("login_btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rf2.ilabx.com/sc/344/electron-microscopy-facility/?tab=requests");
		driver.findElement(By.xpath("//div[@id='equipment_button']")).click();
		driver.findElement(By.id("schedule_button_91324")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[@class='dhx_scale_hour'][3]"));
		act.doubleClick(ele).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(("//div[@class='ui selection dropdown no_auto_init']"))).click();
		Thread.sleep(1000);
		act.sendKeys(Keys.DOWN).build().perform();
		driver.findElement(By.xpath("//button[@class='ui primary button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='service_event_save_button']")).click();
		Thread.sleep(3000);
		WebElement main = driver.findElement(By.xpath("//div[@class='event_body']"));
		Thread.sleep(2000);
		act.doubleClick(main).build().perform();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\vishgarg\\OneDrive - Agilent Technologies\\Desktop\\Selenium\\Maintainace.png");
		 FileUtils.copyFile(SrcFile, DestFile);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='translation_missing']")).click();
		 Thread.sleep(2000);
		 Alert SimpleAlert = driver.switchTo().alert();
		 SimpleAlert.accept();
		 Thread.sleep(2000);
		 driver.findElement(By.id("sign_out_btn")).click();
		 
		
		
	}
	}