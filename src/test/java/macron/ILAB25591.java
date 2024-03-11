package macron;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILAB25591 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-j.tst-34.aws.agilent.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm1n234!");
		driver.findElement(By.id("login_btn")).click();
		driver.get("https://web-j.tst-34.aws.agilent.com/sc/332/electron-microscopy-facility/?tab=requests");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='requests']/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='top_nav']/div[2]/span[2]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.id("save_quotation")).click();
		Thread.sleep(2000);
		
		

	}

}
