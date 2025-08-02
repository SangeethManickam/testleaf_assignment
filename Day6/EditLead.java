package week3.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sangeeth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manickam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sangeeth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("QA - Testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sangeeth@gmail.com");
		
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropdown = new Select(dropDownElement);
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Goahead");
			
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
	}

}
