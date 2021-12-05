package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver ();
    	driver.get(" http://leaftaps.com/opentaps/control/login");
    	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pandian");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select select = new Select(element);
		select.selectByVisibleText("Partner");
WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel=new Select(element2);
		sel.selectByVisibleText("Demo Marketing Campaign");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rat");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Na");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/05/1998");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tablets");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3 LPA");
		WebElement element3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select con= new Select(element3);
		con.selectByVisibleText("INR - Indian Rupee");
		WebElement element4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ind= new Select(element4);
		ind.selectByVisibleText("Computer Software");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("220000");
		WebElement element5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own= new Select(element5);
		own.selectByVisibleText("Sole Proprietorship");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Stepped into Autoamtion");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium Webdriver");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04363");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7654320976");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("233");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Resource person");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http:leaftaps.com/opentaps");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rathna");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Rat");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Ram Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near Bus stand");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Mayiladuthurai");
		
		WebElement element6= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select coun= new Select(element6);
		coun.selectByVisibleText("United States");
		
		
		
	
		

	WebElement element7= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state= new Select(element7);
		state.selectByVisibleText("Texas");
		
		

		

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("2377");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("609001");

		driver.findElement(By.name("submitButton")).click();
		String txt = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();






		
		



		
		// TODO Auto-generated method stub

	}

}
