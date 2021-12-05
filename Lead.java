package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {



	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get(" http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pandian");
		String title1=driver.getTitle();
		System.out.println(title1);
		 WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select select = new Select(element);
		select.selectByVisibleText("Partner");
		driver.findElement(By.name("submitButton")).click();
String txt = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
System.out.println(txt);

		
		
		// TODO Auto-generated method stub

	}

}
