package week2.day2.Assignments;

/*http://leaftaps.com/opentaps/control/main

Delete Lead:
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Phone
9	Enter phone number
10	Click find leads button
11	Capture lead ID of First Resulting lead
12	Click First Resulting lead
13	Click Delete
14	Click Find leads
15	Enter captured lead ID
16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		  driver.findElement(By.name("phoneNumber")).sendKeys("44");
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  Thread.sleep(1000); WebElement lead1 =
		  driver.findElement(By.xpath("(//a[@class='linktext'])[4]")); String
		  attribute1 = lead1.getText(); lead1.click();
		  
		  driver.findElement(By.className("subMenuButtonDangerous")).click();
		  driver.findElement(By.linkText("Find Leads")).click();
		  driver.findElement(By.name("id")).sendKeys(attribute1);
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  Thread.sleep(1000); String message =
		  driver.findElement(By.className("x-paging-info")).getText(); if
		  (message.equals("No records to display"))
		  System.out.println("Successfully deleted the lead"); else
		  
		  System.out.println("pls look into console"); driver.close();
		 

	}

}
