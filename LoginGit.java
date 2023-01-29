package logingit;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginGit {
	
	     public static void main(String[] args) throws InterruptedException
	     {
	    	 String expectedtitle="facebook.com";
	          System.setProperty("webdriver.chrome.driver","D:\\driver1\\chromedriver.exe"); 
	          WebDriver driver = new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("https://www.facebook.com");
	          driver.navigate().refresh();                                                  //it is to refresh the paage
	          Thread.sleep(2000);
	 //         driver.navigate().to("https://www.facebook.com");                                   //it is alternative of get method
	        driver.navigate().back();                                                         //it is to go back 
	        Thread.sleep(2000); 
	        driver.navigate().forward(); 
	        Thread.sleep(2000);
	        driver.findElement(By.id("email")).sendKeys("youvusername@gmail.com");
	    
	          driver.findElement(By.id("pass")).sendKeys("password");
	          Thread.sleep(5000);
	       //   driver.findElement(By.name("login")).click(); 
	      //    Thread.sleep(7000);
	          String actualtitle = driver.getTitle(); 
	          System.out.println(actualtitle);  
	      //    Assert.assertEquals(expectedtitle, actualtitle);
	          if(actualtitle.equalsIgnoreCase(expectedtitle))
	  			System.out.println("Title Matched");
	  		else
	  			System.out.println("Title didn't match");
	          driver.quit();
	          
	     }
	}
