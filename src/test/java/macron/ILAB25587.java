package macron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILAB25587 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-j.tst-34.aws.agilent.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm1n234!");
		driver.findElement(By.id("login_btn")).click();
		driver.get("https://web-j.tst-34.aws.agilent.com/sc/332/electron-microscopy-facility/?tab=requests");
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//a[@class='generate_quote']")).isDisplayed());
				{
			System.out.println("Test case is passed");
			
		}
				driver.close();
	}

}
