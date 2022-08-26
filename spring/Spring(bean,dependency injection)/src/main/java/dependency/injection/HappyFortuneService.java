package dependency.injection;

public class HappyFortuneService implements FortuneServices{


    @Override
    public String getFortuneService() {
        return "provide Happy Fortune Services";
    }
}
