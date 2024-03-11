package macron;

import org.testng.annotations.Test;

@Test

public class ILAB25590_Final {
	public void Alert() throws InterruptedException {
		Login log = new Login();
		log.DriverLaunch();
		log.navigation();
		log.Alertcheck();
	}
	

}
