package week4.Day7;

public class LoginPage_2B extends BasePage_2B{
	
	public void performCommonTasks() {
		System.out.println("LoginPage_2B::performCommonTasks");
		super.performCommonTasks();
		super.enterText();
		//Super Keyword is used to access the methods of Superclass(baseclass) from a SubClass 
	}
	
	public static void main(String[] args) {
		LoginPage_2B method = new LoginPage_2B();
		method.clickElement();
		method.enterText();
		method.findElement();
		method.performCommonTasks();
	}
	
}
