package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
  
  public WebDriver driver;

  public WebDriver driverInitialization() throws IOException {
    // To read the properties
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");

    // To access the data.properties file
    Properties prop = new Properties();
    prop.load(fis);
    String browserName = prop.getProperty("browser");
    if (browserName.contentEquals("chrome")) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\New folder\\chromedriver.exe");
         //driver = new ChromeDriver();   
    	//WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); //To run  specic chrome driver 
       // WebDriverManager.chromedriver().setup(); // This will run with latest version
             driver = new ChromeDriver();  
    } else if (browserName.contentEquals("firfox")) {
      // Firefox

    } else if (browserName.contentEquals("Edge")) {

    }
    else {
      
      System.out.print(" please provide proper browser value");
      
    }
    return driver;

  }
  @BeforeMethod
  public void launchurl() throws IOException {
	  driver=driverInitialization();
  }
  @AfterMethod
  public void closebrowser() throws IOException {
	  driver.close();
  }

}