package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 // Verification Steps
		 String OrgTitle = "Leaftaps - TestLeaf Automation Platform";
		 String title = driver.getTitle();
		 
		 if (OrgTitle.equals(OrgTitle)) {
			System.out.println("Landed in correct page");
		}
		 else {
			System.out.println("worng page");
		}
		 // to click the link CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// to click the tab Leads
		driver.findElement(By.linkText ("Leads")).click();
		// to click the Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name, sendkeys
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AXA Insurance");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Roshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Abusali");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Roshini");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Abusali");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/07/82");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software QA Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Strategic Transformation");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("34000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("300");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("345678");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Text Description Comment");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		
		// assignment 2 contact information and primary address
		
	
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		Thread.sleep(3000);
		countryCode.sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("610366");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("81826489");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Preeti");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("roshini_sb@yahoo.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.axa.com.sg");
		
		// Primary address
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Roshini");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Preeti");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("#05-421, BLK 366");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Corporation Driver");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Singapore");
		// dropdown
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select (state);
		dropdown1.selectByVisibleText("California");
		
		
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("610366");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0065");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//landing page verification
		
		String titleViewLeadPage = "View Lead | opentaps CRM";
		
		String pageTitle2 = driver.getTitle();
		if (titleViewLeadPage.equals(pageTitle2)) {
			System.out.println("We have landed on correct window");
		} else {
			System.out.println(pageTitle2);
			System.out.println("Incorrect page");
		}		
		
	}
		
		
	}


