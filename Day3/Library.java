package week2.Day3;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book = new Library();
		book.addBook("The Guardian");
		book.issueBook();

	}
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;		
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

}
