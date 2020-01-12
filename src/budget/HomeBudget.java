package budget;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;

public class HomeBudget {

    public static final String DB_HOST = "morfeusz.wszib.edu.pl";
    public static final int DB_PORT = 1433;
    public static final String DB_USER = "tmarecik";
    public static final String DB_PASS = "tomi,12345WSZIB";
    public static final String DB_NAME = "tmarecik";


    public static final String INSERT_ENTRY_SQL = "INSERT INTO budget.BudgetEntire (EntryName, Amounth) VALUES (?, ?)";
    public static final String GET_ALL_ENTRIES_SQL = "SELECT * FROM budget.BudgetEntire";
    public static final String GET_SUM_SQL = "SELECT SUM(Amounth) as sum FROM budget.BudgetEntire;";


    public static void main(String[] args) {

        BudgetEntry budgetEntry = new BudgetEntry();
        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmount(new BigDecimal(args[1]));

        HomeBudget hb = new HomeBudget();

        try (Connection con = hb.connect(DB_USER, DB_PASS, DB_NAME);
             Statement stmt = con.createStatement()
        ) {

            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, budgetEntry.getEntryName());    //
            ps.setBigDecimal(2, budgetEntry.getAmount());    //
            ps.execute();

            BigDecimal balance;
            ResultSet rs = stmt.executeQuery(GET_SUM_SQL);
            if(rs.next()){
                balance = rs.getBigDecimal("sum");
            } else {
                balance = new BigDecimal(0);
            }

            System.out.println("Zapisano! wydatek: " + budgetEntry.getEntryName());
            System.out.println("Zapisano! kwota: " + budgetEntry.getAmount());

        } catch (SQLException e) {
            System.out.println("Bład: " + e.getMessage());
        }
    }

    private Connection connect(String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(username);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        return ds.getConnection();
    }




}
