import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java2MySQL {
	public static void main(String[] args) {

		Connection db = ConnectionFactory.getInstance().getConnection();

		Statement st;
		try {
			st = db.createStatement();
			ResultSet res = st.executeQuery("SELECT * FROM emp");
			
			while (res.next()) {
				int eid = res.getInt("eid");
				String name = res.getString("name");
				System.out.println(eid + "\t" + name);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}


	}
}