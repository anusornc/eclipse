package scit.ce;

public class MySQL implements Database {

	@Override
	public void connectDatabase(String connString) {
		System.out.println("connect Mysql " + connString);

	}

	@Override
	public void disconnectDatabase() {
		System.out.println("disconnect Mysql");

	}

}
