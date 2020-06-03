package Child;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	   WebDriver  driver = new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	    Actions a=new Actions(driver);
	    WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    //move to specific element
	    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	     a.moveToElement(move).contextClick().build().perform();
	     //drag and drop
	   
	   
	    

	}

}
