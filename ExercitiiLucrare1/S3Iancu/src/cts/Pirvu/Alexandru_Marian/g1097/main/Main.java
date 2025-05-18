package cts.Pirvu.Alexandru_Marian.g1097.main;

import cts.Pirvu.Alexandru_Marian.g1097.factory.FactoryReport;
import cts.Pirvu.Alexandru_Marian.g1097.factory.ReportType;
import cts.Pirvu.Alexandru_Marian.g1097.factory.TestReport;
import cts.Pirvu.Alexandru_Marian.g1097.singleton.AreaConnection;
import cts.Pirvu.Alexandru_Marian.g1097.singleton.InternetConnection;
import cts.Pirvu.Alexandru_Marian.g1097.singleton.TemperatureSensorConnection;

public class Main {
    public static void main(String[] args) {
        AreaConnection areaConnection = AreaConnection.getInstance(100, "200");
        InternetConnection internetConnection = InternetConnection.getInstance("https", "400");
        TemperatureSensorConnection temperatureSensorConnection = TemperatureSensorConnection.getInstance(60.2, "201");

        System.out.println(areaConnection);
        AreaConnection areaConnection1 = AreaConnection.getInstance(80, "799");
        System.out.println(areaConnection1);

        //Exercitiul 2
        FactoryReport factoryReport = new FactoryReport();
        TestReport report = factoryReport.getReport(ReportType.SUCCESS, 1, "Well done");
        report.descriere();
        TestReport report1 = factoryReport.getReport(ReportType.NULL, 2, "Caraibe");
    }
}