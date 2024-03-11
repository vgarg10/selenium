package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;



public class QuickWins {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rf2.ilabx.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).sendKeys("admin@ilabx.com");
		driver.findElement(By.id("password_input")).sendKeys("Adm!n987");
		driver.findElement(By.id("login_btn")).click();
		driver.get("https://rf2.ilabx.com/sc/105/cell-imaging-center/?tab=equipment");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='schedule_button_24470']")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id='scheduler_here']/div[4]/div[8]/div[2]"));
		act.doubleClick(ele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='schedule_select_user_modal']/div/div/div[2]/form/div[1]/div[2]/div[3]/div")).click();
		driver.findElement(By.id("select2-chosen-10")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("s2id_autogen10_search")).sendKeys("stef");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs = entry.getAll();
		for(LogEntry log : logs) {
			System.out.println("the logs from sytem are" + log);
		}
		
		
		}

}
