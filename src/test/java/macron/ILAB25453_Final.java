package macron;

import org.testng.annotations.Test;

@Test 
public class ILAB25453_Final {
	public void Funtions() throws InterruptedException {
		Login log = new Login();
		log.DriverLaunch();
		log.navigation();
		Thread.sleep(5000);
		log.pagetitle();
	}

}
