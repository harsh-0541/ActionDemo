package Exerciseadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.id("fromCity")).click();
	      WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
		  from.sendKeys("mum");
	      Thread.sleep(3000);
	    from.sendKeys(Keys.ARROW_DOWN);
	    from.sendKeys(Keys.ENTER);
	    
	    //driver.findElement(By.id("toCity")).click();
	      WebElement destination= driver.findElement(By.xpath("//input[@placeholder='To']"));
	      destination.sendKeys("del");
	      for(int i=0;i<3;i++)
	      {
	    	  destination.sendKeys(Keys.ARROW_DOWN);
	      }
	      destination.sendKeys(Keys.ENTER);
	      

	    
	    
	
	}

}
