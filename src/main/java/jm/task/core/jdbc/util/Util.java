package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Util {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/firstschema?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123654978kK@WORDIKS";
    Connection connection = null;
    public Connection getConnection(){

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Not connected");
        }
        return connection;
    }
    public void close(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Could not close the connection");
            }
        }
    }
}
