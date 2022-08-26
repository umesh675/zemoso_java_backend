package xml.config;

public class CricketCoach implements Coach{

    private String team;

    public CricketCoach(){
        System.out.println("CricketCoach class");
    }

    @Override
    public void getDetails() {
        System.out.println("Cricket details");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
