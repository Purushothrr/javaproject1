package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle {

	public static void main(String[] args) {		
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.google.co.in");
         
        driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
        driver.findElement(By.name("q")).submit();
       
        	
	}

}
