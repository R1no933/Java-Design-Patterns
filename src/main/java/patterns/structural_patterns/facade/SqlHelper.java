package patterns.structural_patterns.facade;

import java.sql.Connection;

public class SqlHelper {
    public static Connection getSqlConnection() {
        return null;
    }

    public void generatePDFReport(String tableName, Connection connection) {
        //method for get data & generate PDF report
    }

    public void generateHTMLReport(String tableName, Connection connection) {
        //method for get data & generate HTML report
    }
}
