package com.shadabanwar.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cosmetics {

	WebDriver driver;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(23, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);

		String url = "https://tartecosmetics.com";
		driver.get(url);

	}

	@Test
	public void Items() throws InterruptedException
	{
		
		//to click on category New Arrival
		
		//driver.findElement(By.xpath("(//a[contains(text(),'new arrivals')])[1]")).click();
		
		Thread.sleep(3000);
		
		//WebElement newArrivals=driver.findElement(By.xpath("//ul[contains(@class,'desktop-menu')]//a[contains(text(),'new arrivals')]"));
		WebElement newArrivals=driver.findElement(By.xpath("(//a[contains(text(),'new arrivals')])[1]"));
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", newArrivals);
		
		
		//newArrivals.click();
		
		// to close the overlay
		
		//Thread.sleep(5000);
		
		
		
		try {
			//driver.switchTo().frame("//div[@id='bx-group-1146662-CSGcHPO']");
			//driver.findElement(By.xpath("//a[@id='bx-close-inside-1146662']")).click();
			driver.findElement(By.xpath("(//div[text()='No thanks'])[1]")).click();
			
			}
			
			
			catch(Exception e)
			{
				
			}
			
			//finally {
		
		
		//to select first items
		
		//Thread.sleep(4000);
		
		
		
		WebElement firstItem=driver.findElement(By.xpath("//a[contains(@title,'Go to Product: live, love, clay eye set')]"));
		
		JavascriptExecutor executor1= (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", firstItem);
		
		//Thread.sleep(5000);
		
		
		//to click on Add to cart button
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		
		
		  //to click on category New Arrival // creating new webelement with different object reference to avoid stale element exception 
		WebElement newArrivals1=driver.findElement(By.xpath("//ul[contains(@class,'desktop-menu')]//a[contains(text(),'new arrivals')]")); 
		  newArrivals1.click();
		  
		  //to select second items 
		  WebElement secondItem=driver.findElement(By.xpath("//a[contains(@title,'Go to Product: no mirror must-haves color collection')]")); 
		  JavascriptExecutor executor2= (JavascriptExecutor)driver;
		  executor2.executeScript("arguments[0].click();", secondItem);
		  
		  Thread.sleep(3000);
		  
		  //to click on Add to cart button
		  driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		  
		  //to click on category New Arrival // creating new webelement with different object reference to avoid stale element exception 
			
		  Thread.sleep(4000);
		  
			 WebElement newArrivals2=driver.findElement(By.xpath("//ul[contains(@class,'desktop-menu')]//a[contains(text(),'new arrivals')]")); 
                 newArrivals2.click();
			  
			  //to select third item
			  
				
				  WebElement thirdItem=driver.findElement(By.
				  xpath("//a[@title='Go to Product: knockout pore refining set']"));
				  
				  
				  JavascriptExecutor executor3= (JavascriptExecutor)driver;
				  executor3.executeScript("arguments[0].click();", thirdItem);
				  
				  
				  
				  driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
				 
			  
			  //to click on Bag
			  
			  driver.findElement(By.xpath("//a[contains(@title,'View Bag')]")).click();
			 
		 
		
		//Thread.sleep(3000);
		
		//to remove 1 product from bag
		
		
		
		
		
		
		
		  try{WebElement itemToRemove=driver.findElement(By.
		  xpath("//td[@class='item-image']//img[@title='live, love, clay eye set']//parent::td//following-sibling::td[@class='remove']//button"
		  )) ;
		  
		  itemToRemove.click();} catch(Exception e) {
		  
		  }
		 
		 
		 
		  
			
			
			/*
			 * JavascriptExecutor executor4= (JavascriptExecutor)driver;
			 * executor4.executeScript("arguments[0].click();", itemToRemove);
			 */
			 

	}
	
	
	/*
	 * @AfterTest public void TearDown() { driver.quit();
	 * 
	 * }
	 */
	 
} 




