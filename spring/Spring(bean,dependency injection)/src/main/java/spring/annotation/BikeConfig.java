package spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:vehicle.properties")
public class BikeConfig {

    @Bean
    public IEngine engine(){
        return new Engine();
    }

    @Bean
    public Vehicle bike(){
        return new Bike(engine());
    }
}
