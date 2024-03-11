package macron;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	WebDriver driver ;
	
	public void DriverLaunch() {
		driver = new ChromeDriver();
	}
	
	// 1st Function 
     public void navigation() throws InterruptedException {
    	 driver.get("https://web-j.tst-34.aws.agilent.com/");
 		driver.manage().window().maximize();
 		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
 		driver.findElement(By.id("password_input")).sendKeys("Adm1n234!");
 		driver.findElement(By.id("login_btn")).click();
 		driver.get("https://web-j.tst-34.aws.agilent.com/sc/333/electron-microscopy-facility/?tab=requests");
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//*[@id=\'requests']/div[1]/div[1]/div[2]/a[1]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id='top_nav']/div[2]/span[2]")).click();
     }
     
     // 2nd Function 
     public void pagetitle() throws InterruptedException {
    	//driver.findElement(By.xpath("//*[@id=\'requests\']/div[1]/div[1]/div[2]/a[1]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id='top_nav']/div[2]/span[2]")).click();
 		Thread.sleep(2000);
 		String title = driver.findElement(By.xpath("//*[@id='main_page_content']/div[2]/div/div[2]/div/div[1]/div/div[2]")).getText();
 		System.out.println("the tile of the page is " + title);
 		String customertitle = driver.findElement(By.xpath("//div[@class='ui two column grid padded']/div[1]")).getText();
 		System.out.println("the tile of the page is " + customertitle);
 		String customername= driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[2]")).getText();
 		System.out.println("the tile of the page is " + customername);
 		String Email = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[3]")).getText();
 		System.out.println("the tile of the page is " + Email);
 		String Organ = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[4]/div[1]")).getText();
 		System.out.println("the tile of the page is " + Organ);
 		String Bill = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[5]/div[1]")).getText();
 		System.out.println("the tile of the page is " + Bill);
 		String Date = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[6]/div[1]")).getText();
 		System.out.println("the tile of the page is " + Date);
 		String Note = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[7]/div[1]/label")).getText();
 		System.out.println("the tile of the page is " + Note);
 		String Service = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[8]")).getText();
 		System.out.println("the tile of the page is " + Service);
 		Thread.sleep(2000);
 		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
 		String Terms = driver.findElement(By.xpath("//*[@id='new_quotation']/div[3]/div[10]/div[1]/label")).getText();
 		System.out.println("the tile of the page is " + Terms);
     }
     public void Alertcheck() throws InterruptedException {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy(0,800)", "");
 		WebElement generator_button =driver.findElement(By.xpath("//input[@class='ui right floated blue button']"));
 		generator_button.click();
 		Thread.sleep(3000);
 		String Error =driver.findElement(By.xpath("//div[@class='ui row eight wide column error message']")).getText();
 		System.out.println("the errors are " +Error);
 		driver.findElement(By.xpath("//*[@id='new_quotation']/div[5]/div/a")).click();
 		Thread.sleep(3000);
 		driver.switchTo().alert().dismiss();
 		JavascriptExecutor js1 = (JavascriptExecutor) driver;
 		js1.executeScript("window.scrollBy(0,400)", "");
 		Thread.sleep(4000);
 		driver.findElement(By.xpath("//*[@id='new_quotation']/div[5]/div/a")).click();
 		Thread.sleep(3000);
 		driver.switchTo().alert().accept();
 		Thread.sleep(2000);
 		String B = driver.getCurrentUrl();
 		
 		String A = "https://web-j.tst-34.aws.agilent.com/sc/333/electron-microscopy-facility?tab=requests";
 		if ( A==B)
 		{
 			System.out.println("the navigation is correct");
 		}
 		else {
 			System.out.println("the test case fail");
 		}
    	 
     }
     
     public void Form() throws InterruptedException{
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
    	 
     
    	 
     }
}
