package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElement(By.id("home")).click();
		
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		System.out.println("Location : " + driver.findElement(By.id("position")).getLocation());
		System.out.println("Colour   : " + driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Size      :" + driver.findElement(By.id("size")).getSize()); 
		
		
		

	}

}
