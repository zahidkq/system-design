package solid.srp;

public class Report {
    private String content;

    public void generate(){
        content = "This is the Report content...";
    }

    public String getContent(){
        return content;
    }

}
