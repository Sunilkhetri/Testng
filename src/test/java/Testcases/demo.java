package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Baseclass;

public class demo extends Baseclass {
	@Test
	public void method() throws IOException {
	driver=driverInitialization();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}

}
