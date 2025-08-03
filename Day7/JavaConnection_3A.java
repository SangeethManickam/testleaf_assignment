package week4.Day7;

public class JavaConnection_3A implements DatabseConnection_3A{

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
		System.out.println("executeUpdate");	
		
	}
	public static void main(String[] args) {
		JavaConnection_3A connection = new JavaConnection_3A();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
	}

}
