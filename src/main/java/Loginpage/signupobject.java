package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupobject {
	
	public WebDriver driver;
	By firstname= By.xpath("//input[@name='UserFirstName']");
	By employee= By.xpath("//select[@id='CompanyEmployees-fQzy']");
	
	public signupobject(WebDriver driver2) {
	this.driver=driver2;

}
	
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enteremployee() {
		return driver.findElement(employee);
	}



}
