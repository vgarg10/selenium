package selenium;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Excel {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rf2.ilabx.com");
		driver.manage().window().maximize();        
	}

}
