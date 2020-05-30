package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  @Test
  public void methodOneA() {
	  
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("http://www.google.com/");
	  
	  driver.close();
	  
  }
}
