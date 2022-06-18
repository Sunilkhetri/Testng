package Logintestcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Loginpage.Loginpageobject;
import Resources.Baseclass;
import Resources.Constantfinal;
import bsh.org.objectweb.asm.Constants;

public class caselogin extends Baseclass  {
	@Test(dataProvider="testdata")
	
	public void launchurl(String username,String password) throws IOException {
		driver.get("https://login.salesforce.com/");
		
		Loginpageobject obj = new Loginpageobject (driver);
		obj.enterusername().sendKeys(username);
		obj.enterpassword().sendKeys(password);
		obj.enterlogin().click();
	}
	@DataProvider
	public Object[][]testdata(){
		Object[][] data= new Object[3][2];
		 data[0][0]=Constantfinal.username;
		 data[0][1]=Constantfinal.password;
		 data[1][0]=Constantfinal.username1;
		 data[1][1]=Constantfinal.password1;
		 data[2][0]=Constantfinal.username2;
		 data[2][1]=Constantfinal.password2;
		 
	
	
return data;
	}
		
	}

	

