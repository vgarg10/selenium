package uiux;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ILAB16353 {

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
		driver.findElement(By.xpath("//button[@class='ui small button']")).click();
		Thread.sleep(2000);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\vishgarg\\OneDrive - Agilent Technologies\\Desktop\\Selenium\\Calendardetails.png");
		 FileUtils.copyFile(SrcFile, DestFile);
		 Thread.sleep(2000);
		String A = driver.findElement(By.xpath("//div[@class='ui modal transition visible active']")).getText();
        System.out.println("the text of the model is "+ A);
        Thread.sleep(2000);
        driver.quit();
	
		
	}
}
