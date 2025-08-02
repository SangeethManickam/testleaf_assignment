package week3.Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '123456789')]/../../td/div")));
		
		String leadID = element.getText();
		element.findElement(By.tagName("a")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		
		WebElement findLead = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Find Leads']")));
		findLead.click();		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::div/input")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'records')]")).getText();
		System.out.println(text);
		
		
		
		
		
		

	}

}
