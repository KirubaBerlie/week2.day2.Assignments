
package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/Edit.html");

		driver.findElement(By.id("email")).sendKeys("testabc.gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Text added to check APPEND");

		System.out.println("Default text entered: " + driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	
				
		WebElement enableCheck = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
				
		boolean enabled = enableCheck.isEnabled();
		if(enabled)
			System.out.println("Confirm that edit field is Enabled");
		else
			System.out.println("Confirm that edit field is disabled");
					
		

	}

}
