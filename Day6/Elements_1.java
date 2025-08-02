package week3.Day6;

public class Elements_1 extends Button_1 {

	public static void main(String[] args) {
		
		
		Elements_1 a = new Elements_1();
		a.submit();
		a.click();
		a.setText("Inheritance : Elements_1");		
		System.out.println(text+"\n");
		
		CheckBoxButton_1 b = new CheckBoxButton_1();
		b.clickCheckButton();
		b.submit();
		b.click();
		b.setText("Inheritance : CheckBoxButton_1");
		System.out.println(text);

	}

}
