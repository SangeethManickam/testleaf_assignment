package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		//LoginPage
		driver.get("http://leaftaps.com/opentaps");	
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Create Account 
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Sangeeth");
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester.");
		
		WebElement industryElement = driver.findElement(By.xpath("//select[@name='industryEnumId']"));;
		Select industry = new Select(industryElement);
		industry.selectByValue("IND_SOFTWARE");
		
		WebElement ownershipElement = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownership = new Select(ownershipElement);
		ownership.selectByVisibleText("S-Corporation");
		
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceElement);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaignElement = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaign = new Select(marketingCampaignElement);
		marketingCampaign.selectByIndex(6);
		
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateElement);
		state.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		// Validate Account Name
		String accountName = driver.findElement(By.xpath("//span[contains(text(),'Sangeeth')]")).getText();
		if(accountName.contains("Sangeeth"))
		{
			System.out.println("Account Created Successfully");
			System.out.println("Account Name : "+ accountName);
		}
		else
			System.out.println("Issue in Account creation");
		
		driver.close();
	}

}
