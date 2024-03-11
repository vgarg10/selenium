package macron;

import org.testng.annotations.Test;

@Test 
public class ILAB25455 {
	public void Priceupdate() throws InterruptedException {
		Login log = new Login();
		log.DriverLaunch();
		log.navigation();
		log.Form();
		
	}

}
