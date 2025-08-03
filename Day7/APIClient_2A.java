package week4.Day7;

public class APIClient_2A {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Endpoint : " + endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Endpoint : "+ endpoint);
		System.out.println("RequestBody : "+ requestBody);
		System.out.println("RequestStatus : "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient_2A API = new APIClient_2A();
		API.sendRequest("google.com");
		API.sendRequest("google.com", "Transalator", true);
	}

}
