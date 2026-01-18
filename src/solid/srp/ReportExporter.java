package solid.srp;

public class ReportExporter {
    public void exportToPDF(Report report){
        System.out.println("Exporting to PDF: " + report.getContent());
    }
}
