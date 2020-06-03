package Child;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPrice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone XR (64GB) - Yellow')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='priceblock_ourprice']"))).getText());

	}

}
