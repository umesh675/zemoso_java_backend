package aop.advice.pojo;

import java.util.concurrent.TimeUnit;

public class TrafficFortuneService {

    public String getFortune(){

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Except light traffic";
    }
}
