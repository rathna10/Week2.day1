package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {


	public static void main(String[] args){
		
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver ();
	    	driver.get(" http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Find Contacts")).click();
			driver.findElement(By.linkText("Email")).click();
			driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
			driver.findElement(By.className("x-btn-text")).click();
			//driver.close();
			
			
		// TODO Auto-generated method stub

	}

}
