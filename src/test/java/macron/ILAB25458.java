package macron;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ILAB25458 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// Login to application 
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
		driver.findElement(By.id("quotation_title")).sendKeys("Macron");
		Thread.sleep(1000);
		driver.findElement(By.id("quotation_customer_name")).sendKeys("Lola Paucek");
		Thread.sleep(1000);
		driver.findElement(By.id("quotation_customer_email")).sendKeys("vishal.garg@agilent.com");
		Thread.sleep(1000);
		driver.findElement(By.id("quotation_customer_organization")).sendKeys("School of science");
		Thread.sleep(1000);
		driver.findElement(By.id("quotation_billing_address")).sendKeys("Tokyo");
		Thread.sleep(1000);
		driver.findElement(By.id("quotation_expiration_date")).sendKeys("01/04/2024");
		Thread.sleep(1000);
		driver.findElement(By.id("quotation_notes")).sendKeys("The Hindu is an Indian English-language daily newspaper owned by The Hindu Group, headquartered in Chennai, Tamil Nadu. It began as a weekly in 1878 and became a daily in 1889. It is one of the Indian newspapers of record and the second most circulated English-language newspaper in India, after The Times of India.");
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='s2id_service_charge_id']/a/span[2]")).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);	
		String m = driver.findElement(By.xpath("//div[@class='ui input quote_item_qty_wrapper']")).getText();
		System.out.println("the value of text is " +m);
		
		
		

	}

}
