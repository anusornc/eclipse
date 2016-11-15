package scit.ce;

public interface Database {
	public void connectDatabase(String connString);
	public void disconnectDatabase();
}
