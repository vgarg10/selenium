package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-j.tst-34.aws.agilent.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm1n234!");
		driver.findElement(By.id("login_btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://web-j.tst-34.aws.agilent.com/service_centers/332/quotations/new");
		Thread.sleep(2000);
		driver.findElement(By.id("select2-chosen-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("s2id_autogen1_search")).sendKeys("1");
		Thread.sleep(2000);
		List< WebElement> options= driver.findElements(By.cssSelector("li[class='select2-results-dept-1 select2-result select2-result-selectable']"));
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("100 Cycle Paired End Sequencing 1 Lane"))
			{
				option.click();
				break;
			}
		}
		
		

	}

}
