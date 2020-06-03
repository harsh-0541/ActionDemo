package Child;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StarAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
		   //driver.get("https://www.tripadvisor.in/");
		  // driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		   
		  /* WebElement source= driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
	       source.sendKeys("club mahindra");
	       source.sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")).click();
            driver.findElement(By.xpath("//div[@id='atf_header_wrap'] //span[@class='hotels-hotel-review-atf-info-parts-Rating__reviewCount--1sk1X']")).click();
          driver.findElement(By.xpath("//a[@class='ui_button primary']")).click();
          /*Actions a=new Actions(driver);
          WebElement move=driver.findElement(By.id("bubble_rating"));
          a.moveToElement(move).click().build().perform();*/
		   
		   driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
		   Thread.sleep(5000);
           Actions a=new Actions(driver);
           a.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='bubble_rating']"))),50,0).click().build().perform();
          
		   
		     
	}

}
