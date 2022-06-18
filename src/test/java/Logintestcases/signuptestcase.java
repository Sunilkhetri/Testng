package Logintestcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Loginpage.signupobject;
import Resources.Baseclass;

public class signuptestcase extends Baseclass {

	
	
		@Test
		
		public void launchurl1() throws IOException {
			
			driver=driverInitialization();
			driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
			
			signupobject obj = new signupobject (driver);
			obj.enterfirstname().sendKeys("rahul");
			Select s= new Select(obj.enteremployee());
			s.selectByIndex(1);
}
}
