package Exerciseadvanced;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   System.out.println(driver.findElements(By.tagName("a")).size());
		   
		   WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		   System.out.println(footerdriver.findElements(By.tagName("a")).size());
		  
		   WebElement CoulumnFirst=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		   System.out.println(CoulumnFirst.findElements(By.tagName("a")).size());
		   for(int i=1;i<CoulumnFirst.findElements(By.tagName("a")).size();i++)
		   {
			   String Clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			   CoulumnFirst.findElements(By.tagName("a")).get(i).sendKeys(Clickontab);
		   }
		   
		   
		 Set<String> abc=  driver.getWindowHandles();
	     Iterator<String> it=abc.iterator();
	     
	     
	     while(it.hasNext())
	     {
	    	 driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	     }
		   
		   
		  
		 
		   
	}

}
