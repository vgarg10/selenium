package fy2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revalidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Login to application 
		
		driver.get("https://rf2.ilabx.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm!n987");
		driver.findElement(By.id("login_btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("left_menu_btn")).click();
		driver.findElement(By.xpath("//*[@id='left_menu_sidebar']/div/div/div[3]/div/a[6]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='horizontal_tabs_wrapper']/a[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("billing_event_bulk_actions_link")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='billing_event_bulk_actions']/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("revalidate_billing_files")).click();
		Thread.sleep(4000);
		
		WebElement Table = driver.findElement(By.xpath("//*[@id='bulk_action_table']"));
		List <WebElement> r1= Table.findElements(By.tagName("tr"));
		int Expected;
		Expected = r1.size();
		Thread.sleep(2000);
		
		System.out.println("the number of rows in table are :-"+ Expected);
		Thread.sleep(3000);
		
		driver.findElement(By.id("revalidate_button")).click();
		Thread.sleep(2000);
		
		String A = driver.findElement(By.xpath("//div[@class='ui warning message']")).getText();
		System.out.println("the text of warning message is " +A );
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//a[@class='mfp_trigger_close ui cancel basic blue button']")).click();
	    driver.findElement(By.id("sign_out_btn")).click();
	    driver.close();
		
		
		
		
		
		

	}

}
