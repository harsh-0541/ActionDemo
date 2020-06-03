package Exerciseadvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class SortTable {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		   driver.findElement(By.xpath("//tr/th[2]")).click();
		   driver.findElement(By.xpath("//tr/th[2]")).click();

	        List<WebElement> Fruits=driver.findElements(By.xpath("//tr/td[2]"));
	        ArrayList<String> original=new ArrayList<String>();
	        for(int i=0;i<Fruits.size();i++)
	        {
	        	original.add(Fruits.get(i).getText());
	        }
	        ArrayList<String> Copied=new ArrayList<String>();
	        for(int i=0;i<original.size();i++)
	        {
	        	Copied.add(original.get(i));
	         }
	        
	        Collections.sort(Copied);
	        Collections.reverse(Copied);
	        for(String s:Copied)
	        {
	        	System.out.println(s);
	        }
	        System.out.println("********original*********");
	        for(String s:original)
	        {
	        	System.out.println(s);
	        }
	        Assert.assertTrue(original.equals(Copied));
	        
		   
		

	}

}
