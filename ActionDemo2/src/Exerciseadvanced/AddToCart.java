package Exerciseadvanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    
	public static void main(String[] args) 
	{
		int j=0;

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
		   String[] Products= {"Cucumber","Brocolli","Beetroot","Carrot"};
		   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 List<WebElement> veggie= driver.findElements(By.cssSelector("h4.product-name"));
		 for(int i=0;i<veggie.size();i++)
		 {
			String[] name= veggie.get(i).getText().split("-");
			String Updatedname =name[0].trim();
			List Productslist=Arrays.asList(Products);
			if(Productslist.contains(Updatedname))
				
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==Products.length)
					break;
			}
		 }
		   
	}
}


