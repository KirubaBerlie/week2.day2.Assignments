package week2.day2.Assignments;


import java.time.Duration;

//FaceBook:
//================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
//            ( A normal click will do for this step) 


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://en-gb.facebook.com/");
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kiruba");
		//last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Berlie");
		//email or phone
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8975469874");
		
		//password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("GreatDay");
	
		//birthday
		WebElement dropdownDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dropDay = new Select(dropdownDay);
		dropDay.selectByIndex(12);
		
		
		//birthMonth
		WebElement dropdownMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dropMonth = new Select(dropdownMonth);
		dropMonth.selectByVisibleText("Jun");
		
		//birthYear
		WebElement dropdownYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dropYear = new Select(dropdownYear);
		dropYear.selectByValue("2003");
		
		//Female
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		
		
		
		
	}

}
