package dependency.injection;

public class BaseballCoach implements Coach {

    private FortuneServices fortuneServices;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneServices fortuneServices){
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDetails() {
        return ("Baseball details");
    }

    @Override
    public String getDailyFortune() {
        return (fortuneServices.getFortuneService());
    }
}
