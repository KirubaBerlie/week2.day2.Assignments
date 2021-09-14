package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//SalesForce:
	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL 
	// https:www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Fill in all the text boxes
	// Step 7: Handle all the dropdowns
	// Step 8: Click the check box
	// Step 9: Close the browser
    //*Note: No need click Start my freeTrial
// My Learning : For last checkbox () not given for collection, so got ElementClickIntercepted Exception 
// (//div[@class='checkbox-ui'])[1]")




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] ar0gs) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//input[@name ='UserFirstName']")).sendKeys("Kiruba");
	driver.findElement(By.xpath("//input[@name ='UserLastName']")).sendKeys("LastName");
	driver.findElement(By.xpath("//input[contains(@name,'Email')]")).sendKeys("kiruba.123@gmail.com");
	
	WebElement titleDropdown = driver.findElement(By.xpath("//select[contains(@name,'Title')]"));
	Select titleDrop = new Select(titleDropdown);
	titleDrop.selectByVisibleText("Sales Manager");
	
	driver.findElement(By.name("CompanyName")).sendKeys("TCS");
	
	WebElement complanyDropdown = driver.findElement(By.name("CompanyEmployees"));
	Select companyDrop = new Select(complanyDropdown);
	companyDrop.selectByValue("950");
	driver.findElement(By.name("UserPhone")).sendKeys("43433525");
	
	WebElement countryDropdown = driver.findElement(By.name("CompanyCountry"));
	Select countryDrop = new Select(countryDropdown);
	countryDrop.selectByValue("MV");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
	System.out.println("Done!!!");
	
	
}

}
