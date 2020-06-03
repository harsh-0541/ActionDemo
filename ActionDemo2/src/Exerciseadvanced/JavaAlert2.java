package Exerciseadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert2 {

	public static void main(String[] args) throws InterruptedException 
	{     
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   System.out.println(driver.findElements(By.tagName("iframe")).size());
		   driver.switchTo().frame("iframe-name");
		   driver.findElement(By.xpath("//a[contains( text(),'in')]")).click();
		   
		   

		
	}

}
