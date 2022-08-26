package dependency.injection;

public class BadmintonCoach implements Coach{

    private String email;
    private String team;

    @Override
    public String getDetails() {
        return "badminton coach";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
