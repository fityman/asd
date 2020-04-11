package db;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static final String username = "SYSTEM";
    private static final String password = "";
    private static final String URL = "jdbc:oracle:thin:@192.168.1.8:1521:xe";

    public static Connection getConnection() throws SQLException {
        try {
            OracleDataSource ods = new OracleDataSource();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            ods.setURL(URL);
            Connection conn = ods.getConnection(username, password);
            System.out.println("Sikerült csatlakozni");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return DriverManager.getConnection(username);
    }
}
