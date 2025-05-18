package cts.Pirvu.Alexandru_Marian.g1097.factory;

import java.lang.invoke.WrongMethodTypeException;

public class FactoryReport {

    public TestReport getReport(ReportType reportType, int id, String message) throws Error
    {
        switch (reportType){
            case SUCCESS:
                TestReport succesReport = new SuccessReport(id, message);
                return succesReport;
            case WARNING:
                TestReport warning = new WarningReport(id, message);
                return warning;
            case ERROR:
                TestReport error = new ErrorReport(id, message);
                return error;
            default:
                throw new Error("Wrong report type");
        }
    }
}
