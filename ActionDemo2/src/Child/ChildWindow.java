package Child;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		   System.out.println("Before Switching");
		   System.out.println(driver.getTitle());
		   Set<String> id=driver.getWindowHandles();
		   Iterator<String> it=id.iterator();
		   String ParentId= it.next();
		   String childId=it.next();
		   driver.switchTo().window(childId);
		   System.out.println("After Switching");

		   System.out.println(driver.getTitle());
		   driver.switchTo().window(ParentId);
		   System.out.println("Back to parent Switching");

		   System.out.println(driver.getTitle());

		   
		
	}

}
