package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 // Verification Steps
		 String OrgTitle = "Leaftaps - TestLeaf Automation Platform";
		 driver.get(OrgTitle);
		 
		 if (OrgTitle.equals(OrgTitle)) {
			System.out.println("Landed in correct page");
		}
		 else {
			System.out.println("worng page");
		}
		 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}

}
