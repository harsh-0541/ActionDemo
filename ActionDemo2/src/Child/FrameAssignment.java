package Child;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}