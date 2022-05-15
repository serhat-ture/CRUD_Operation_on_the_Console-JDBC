package CRUDStudent_using_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Setup_Connection {
    public Connection get_connection() {
        String url = "jdbc:postgresql://localhost:5432/myDB";
        String user = "postgres";
        String password = "3440821";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }


    public static void main(String[] args) {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        System.out.println(obj_ConnectDB.get_connection());


    }
}
