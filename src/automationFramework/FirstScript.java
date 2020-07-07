package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanushi Salgado\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		
        //Launch the Online Store Website
		driver.get("https://ikman.lk");
		
		 
		driver.findElement(By.linkText("Vehicles")).click();
		
		
		//driver.findElement(By.id("query")).sendKeys("cars"); // Textfield
		
		/*driver.findElement(By.linkText("Search")).click();*/
		
		//driver.findElement(By.className("ui-btn is-secondary gtm-search")).click(); // Submit button
		
		//driver.findElement(By.id("i-search")).click();
		
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='query']")));   /*examining the xpath for a search     
		    box*/
		 driver.findElement(By.xpath("//*[@id='query']")).sendKeys("cars");   /*enter text in search 
		    box*/
		 
		    
		/* driver.findElement(By.className("ui-icon i-search")).click();*/
		    
		    /*WebElement.sendKeys(Keys.RETURN);*/
		 driver.findElement(By.xpath("//*[@id='query']")).sendKeys(Keys.RETURN);
		 
		 
		 //driver.findElement(By.className("ui-item is-top")).click();
		 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
        
       // driver.findElement(By.linkText("TOP AD")).click();
        
        //class="item-title h4"
        driver.findElement(By.className("item-title")).click();		
        		
		//Wait for 5 Sec
		Thread.sleep(5000);
		
        // Close the driver
        //driver.quit();
    }

}
