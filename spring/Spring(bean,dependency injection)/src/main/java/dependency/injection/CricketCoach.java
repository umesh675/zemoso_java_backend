package dependency.injection;

public class CricketCoach implements Coach {

    private FortuneServices fortuneServices;
    private String coachEmail;
    private String coachTeam;


//    public CricketCoach(FortuneServices fortuneServices){
//        this.fortuneServices = fortuneServices;
//    }

    // setter dependency injection
    public void setFortuneServices(FortuneServices fortuneServices){
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDetails() {
        return ("Cricket details");
    }

    @Override
    public String getDailyFortune() {
        return (fortuneServices.getFortuneService());
    }

    public String getCoachEmail() {
        return coachEmail;
    }

    public void setCoachEmail(String coachEmail) {
        this.coachEmail = coachEmail;
    }

    public String getCoachTeam() {
        return coachTeam;
    }

    public void setCoachTeam(String coachTeam) {
        this.coachTeam = coachTeam;
    }
}
