package solid.srp;

//Single Responsibility Principle - Each class should have only one job/responsibility.

public class SRP {
    public static void main(String[] args){
        Report report = new Report();
        report.generate();

        ReportExporter reportExporter = new ReportExporter();
        reportExporter.exportToPDF(report);

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail("zahid@123", report.getContent());
    }
}
