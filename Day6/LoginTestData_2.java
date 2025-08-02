package week3.Day6;

public class LoginTestData_2 extends TestData_2 {
	
	public void enterUsername()
	{
		System.out.println("enterUsername");
	}
	
	public void enterPassword()
	{
		System.out.println("enterPassword");
	}
	
	public static void main(String[] args) {
		
		LoginTestData_2 a = new LoginTestData_2();
		
		a.enterCredentials();
		a.enterPassword();
		a.enterUsername();
		
		
		TestData_2 b = new TestData_2();
		b.enterCredentials();
		
	}
}
