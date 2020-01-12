package database;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataSource {

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("tmarecik");
        ds.setPassword("tomi,12345WSZIB");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("tmarecik");

        String sql = "SELECT * FROM forum.Topics";

        try (Connection con = ds.getConnection();
             Statement stmt = con.createStatement()){

            System.out.println("-----------------");
            ResultSet rs = stmt.executeQuery(sql);

            String topicBody;
            int id;

            while (rs.next()){
                if ((topicBody = rs.getString("TopicBody")) != null) {
                    id = rs.getInt("ID");
                    System.out.println(id + " " + topicBody);
                    }
                }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
