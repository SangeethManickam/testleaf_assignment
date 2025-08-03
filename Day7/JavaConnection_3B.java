package week4.Day7;

public class JavaConnection_3B extends MySqlConnection_3B{

	@Override
	public void connect() {
		System.out.println("Connect");		
	}

	@Override
	public void disconnect() {
		System.out.println("Dis-Connect");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("JavaConnection::Execute Update");	
		super.executeUpdate();
	}

	@Override
	public void executeQuery() {
		System.out.println("executeQuery");
		
	}
	public static void main(String[] args) {
		JavaConnection_3B database = new JavaConnection_3B();
		database.connect();
		database.disconnect();
		database.executeUpdate();
		database.executeQuery();
	}
	
}
