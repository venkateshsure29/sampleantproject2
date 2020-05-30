package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassThree {
	
	
	 @Test
	  public void methodThreeA() {
		  
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.gmail.com/");
		  
		  driver.close();

}

	 @Test
	 public void methodThreeB()
{
		 
		 System.out.println("Inside ClassThree methodThreeB");
		 
}
}
