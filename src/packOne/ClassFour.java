package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassFour {
	
	@Test
	  public void methodFourA() {
		  
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.yahoo.com/");
		  driver.close();

}

	 @Test
	 public void methodFourB()
{
		 
		 System.out.println("Inside ClassFour methodFourB");
		 
}

}
