package week4.Day7;

public abstract class MySqlConnection_3B implements DatabseConnection_3B{
	
	public abstract void executeQuery();
	
	public void executeUpdate() {
		System.out.println("MySqlConnection::Execute Update");		
	}
}
