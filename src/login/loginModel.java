package login;

import java.sql.Connection;
import java.sql.SQLException;
import db.dbConnection;

public class loginModel {
    Connection connection;

    public loginModel(){
        try {
            this.connection = dbConnection.getConnection();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        if(this.connection == null){
            System.exit(1);
        }
    }
}
