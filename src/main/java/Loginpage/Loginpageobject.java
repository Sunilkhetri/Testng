package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {
	public WebDriver driver;
	By username= By.xpath("//input[@id='username']");
	By password= By.xpath("//input[@id='password']");
	By login= By.xpath("//input[@id='Login']");
	
	//hi
	public Loginpageobject(WebDriver driver2) {
	this.driver=driver2;
	}
	public WebElement enterusername() {
		return driver.findElement(username);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement enterlogin() {
		return driver.findElement(login);
	}
}
;