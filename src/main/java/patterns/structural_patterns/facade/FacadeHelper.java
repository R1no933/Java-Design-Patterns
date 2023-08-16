package patterns.structural_patterns.facade;

import java.sql.Connection;

public class FacadeHelper {
    public static void generateReport(BaseType baseType, ReportType reportType, String tableName) {
        Connection connection = null;
        switch (baseType) {
            case MYSQL:
                connection = SqlHelper.getSqlConnection();
                SqlHelper sqlHelper = new SqlHelper();
                switch (reportType) {
                    case PDF:
                        sqlHelper.generatePDFReport(tableName, connection);
                        break;
                    case HTML:
                        sqlHelper.generateHTMLReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case PDF:
                        oracleHelper.generateHTMLReport(tableName, connection);
                        break;
                    case HTML:
                        oracleHelper.generateHTMLReport(tableName, connection);
                        break;
                }
                break;

        }
    }

    public static enum BaseType {
        MYSQL,
        ORACLE
    }

    public static enum ReportType {
        PDF,
        HTML
    }
}
