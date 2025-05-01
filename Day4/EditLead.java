package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		//LoginPage
		driver.get("http://leaftaps.com/opentaps");	
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");	
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();	
		
		//Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manickam");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Quality Analyst");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Validate Title
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		if(title.equals("Quality Analyst"))
			System.out.println("Lead Created successfully with title : "+title);
		else
			System.out.println("Issue in creating Lead");
		
		driver.close();
			
	}

}
