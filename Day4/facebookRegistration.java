package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegistration {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		//Launch Facebook URL
		driver.get("https://en-gb.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Create New Account
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sangeeth");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[text()='New password']/following::input")).sendKeys("Sang@1234");
		
		//Dropdown : Date of birth
		WebElement date = driver.findElement(By.id("day"));
		Select dobDate = new Select(date);
		dobDate.selectByValue("28");
		
		WebElement month = driver.findElement(By.id("month"));
		Select dobMonth = new Select(month);
		dobMonth.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("year"));
		Select dobYear = new Select(year);
		dobYear.selectByValue("1981");
		
		//Click Radio Button
		driver.findElement(By.xpath("//label[text()='Male']/input")).click();

	}

}
