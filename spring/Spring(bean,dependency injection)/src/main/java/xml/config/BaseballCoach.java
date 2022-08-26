package xml.config;

public class BaseballCoach implements Coach{

    private String coachName;

    public BaseballCoach(){
        System.out.println("Baseball coach");
    }
    @Override
    public void getDetails() {
        System.out.println("Baseball details");
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
}
