import java.sql.*;

public class ConnectionFactory {
	private static ConnectionFactory instance;

	public static String url = "jdbc:mysql://localhost:3306/";
	public static String dbName = "database";
	public static String driver = "com.mysql.jdbc.Driver";
	public static String userName = "root";
	public static String password = "root";
	Connection db =null;

	private ConnectionFactory() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Connection createConnection() {
		if(db!=null)
			return db;
		
		try {
			db = DriverManager.getConnection(url + dbName, userName, password);
		} catch (SQLException e) {
			System.out.println("Unable to connect to the database");
		}
		return db;
	}

	public Connection getConnection() {
		return createConnection();
	}
	
	public static ConnectionFactory getInstance(){
		if(instance == null) instance = new ConnectionFactory();
		return instance;
	}
}
