package laboratorium19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDbRekords {


    public static final String PERSON_INFORMATION = "select Top 10 * from Person.Contact where LastName='Anderson'";
    public static final String JOB_TITLE = "select Distinct Title from HumanResources.Employee";

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("tmarecik");
        ds.setPassword("tomi,12345WSZIB");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("AdventureWorks");


        try (Connection con = ds.getConnection();
             Statement stmt = con.createStatement()){

            ResultSet rs = stmt.executeQuery(PERSON_INFORMATION);
            while (rs.next()){
                System.out.println("Name: " + rs.getString("FirstName") + ", Last Name: " + rs.getString("LastName"));
            }

            System.out.println();
            System.out.println("--------------------------");
            System.out.println();

            rs = stmt.executeQuery(JOB_TITLE);
            while (rs.next()){
                System.out.println("Job Tite: " + rs.getString("Title"));
            }



        } catch (SQLException ex) {
            ex.printStackTrace();
        }



//        String sql = ;

    }

}
