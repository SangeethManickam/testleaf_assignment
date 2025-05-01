package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class automateFacebookLogin {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		//Launch Facebook URL
		driver.get("https://www.facebook.com/");
		
		//Enter Username and Password
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//Click the link : ‘Find your account and log in.’
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//Get title of the current page
		String title = driver.getTitle();
		System.out.println("Title : "+title);
	}

}
