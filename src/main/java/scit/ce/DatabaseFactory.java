package scit.ce;

public class DatabaseFactory {
	public Database getDatabase(String dbName) {
		if (dbName.equalsIgnoreCase("oracle")) {
			return new Oracle();
		} else if (dbName.equalsIgnoreCase("mysql")) {
			return new MySQL();
		} else return null;
	}
}
