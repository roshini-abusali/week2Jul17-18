package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import kotlin.reflect.KProperty1.Getter;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Edit.html");
driver.manage().window().maximize();

// enter email id
driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");

// append text
WebElement AddText1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
String text = AddText1.getAttribute("value");
AddText1.clear();
AddText1.sendKeys(text + "SAFE", Keys.TAB);

//get default text entered

WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
String text2 = element2.getAttribute("value");
System.out.println("the default text is" + text2);

// clear text

driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();

// edit field disabled

WebElement element3 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
boolean editElement = element3.isEnabled();

if (editElement == true) {
	
	System.out.println("Enabled");}

else {
	System.out.println("Disabled");
}
	
	
}










	}


