package patterns.structural_patterns.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        String tableName = "Example";

        //generate SQL PDF report with facade pattern
        FacadeHelper.generateReport(FacadeHelper.BaseType.MYSQL, FacadeHelper.ReportType.PDF, tableName);

        //generate ORACLE HTML report with facade pattern
        FacadeHelper.generateReport(FacadeHelper.BaseType.ORACLE, FacadeHelper.ReportType.HTML, tableName);
    }
}
