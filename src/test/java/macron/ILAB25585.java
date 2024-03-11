package macron;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ILAB25585 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Login to application 
		driver.get("https://web-j.tst-34.aws.agilent.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm1n234!");
		driver.findElement(By.id("login_btn")).click();
		driver.get("https://web-j.tst-34.aws.agilent.com/sc/333/electron-microscopy-facility/?tab=admin");
		Thread.sleep(3000);
		
		// Navigating to Settings page
		driver.findElement(By.xpath("//*[@id='edit_other_settings_title_tag']/a")).click();
		driver.findElement(By.id("settings-searchbox")).sendKeys("Enable ability to generate external quotes");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='settings_generate_external_quotes_tr']/td[2]/div/label[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-jaccordion-1-panel-3']/div[2]/button[2]")).click();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\vishgarg\\OneDrive - Agilent Technologies\\Desktop\\Selenium\\ILAB25585.png");
		 FileUtils.copyFile(SrcFile, DestFile);
		Thread.sleep(2000);
		
		// Clicking Toggle of Settings 
		
		driver.findElement(By.xpath("//*[@id='settings_generate_external_quotes_tr']/td[2]/div/label[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-jaccordion-1-panel-3']/div[2]/button[2]")).click();
		TakesScreenshot scrShot1 =((TakesScreenshot)driver);
		File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
		File DestFile1=new File("C:\\Users\\vishgarg\\OneDrive - Agilent Technologies\\Desktop\\Selenium\\ILAB255852.png");
		 FileUtils.copyFile(SrcFile1, DestFile1);
		 driver.quit();	

	}

}
