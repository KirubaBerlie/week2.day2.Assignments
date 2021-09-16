package week2.day2.Assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*http://leaftaps.com/opentaps/control/main

1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Email
9	Enter Email
10	Click find leads button
11	Capture name of First Resulting lead
12	Click First Resulting lead
13	Click Duplicate Lead
14	Verify the title as 'Duplicate Lead'
15	Click Create Lead
16	Confirm the duplicated lead name is same as captured name
17	Close the browser (Do not log out)

*/
public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("hi");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		  driver.findElement(By.name("emailAddress")).sendKeys("abc");
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  
		  Thread.sleep(1000);
		  
		  WebElement lead1 =
		  driver.findElement(By.xpath("(//a[@class='linktext'])[6]")); String
		  attribute1 = lead1.getText(); lead1.click(); System.out.println(attribute1);
		  driver.findElement(By.linkText("Duplicate Lead")).click();
		  
		  String title = driver.getTitle();
		  
		  if (title.contains("Duplicate Lead")) System.out.println(title); else
		  System.out.println("Incorrect tile");
		  
		  driver.findElement(By.name("submitButton")).click(); String leadname =
		  driver.findElement(By.id("viewLead_firstName_sp")).getText(); if
		  (attribute1.equals(leadname)) System.out.println("Lead name Duplicated is " +
		  attribute1); else System.out.println("Incorrect flow"); driver.close();
		 
	}

}
