package database;

import java.sql.*;

public class MyFirstJDBCConnection {

    public static void main(String[] args) {

        String connectionURL = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=tmarecik;password=tomi,12345WSZIB";
        try(Connection con = DriverManager.getConnection(connectionURL);
            Statement stmt = con.createStatement()){  //zasoby umieszczdone w try, po skonczeniu zostana automatycznie zwolnione

            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }

            System.out.println("---------------------");

        } catch (SQLException e) {
            System.out.println("Błąd: " + e.getMessage() + "NR.Błędu: " + e.getSQLState());
        }
    }


}
