package mavenproject;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testhelloworld {
    @Test
    public void testHelloWorld() {
        //System.out.println("Hello world test 1 ");
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\exam\\Desktop\\E3 dol\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
    	 // Instantiate a ChromeDriver class. 
    	 WebDriver driver=new ChromeDriver(); 
    	 
    	 // Launch Website 
    	 driver.navigate().to("http://www.javatpoint.com/"); 
    	 
    	 //Maximize the browser 
    	 driver.manage().window().maximize(); 
    	 
    	 //Scroll down the webpage by 5000 pixels 
    	 JavascriptExecutor js = (JavascriptExecutor)driver; 
    	 js.executeScript("scrollBy(0, 5000)"); 
    	 
    	 // Click on the search text box and send value 
    	 driver.findElement(By.id("gsc-i-id1")).sendKeys("core Java"); 
    	 
    	 // Click on the search button 
    	 driver.findElement(By.className("gsc-search-button")).click(); 
    }
}

