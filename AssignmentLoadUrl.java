package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import kotlin.reflect.KProperty1.Getter;

public class AssignmentLoadUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://acme-test.uipath.com/login");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.id("password")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@type='submit']")).click();

String OrgTitle = "ACME System 1 - Dashboard";
String title = driver.getTitle();
if (OrgTitle.equals(OrgTitle)) {
	System.out.println("Correct Page");
}
else {
	System.out.println("Worng Page");
}

	}

}
