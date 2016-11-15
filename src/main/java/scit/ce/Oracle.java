package scit.ce;

public class Oracle implements Database {

	public void connectDatabase(String connString) {
		System.out.println("connect Oracle " + connString);

	}

	public void disconnectDatabase() {
		System.out.println("Disconnect Oracle");

	}

}
