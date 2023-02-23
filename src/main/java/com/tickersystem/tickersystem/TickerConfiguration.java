package com.tickersystem.tickersystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TickerConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(TickerRepository tickerRepository){
        return args -> {
            Ticker apple = new Ticker(
                    "APPL",
                    100
            );

            Ticker orange = new Ticker(
                    "APL",
                    102
            );
            //tickerRepository.saveAll(List.of(apple, orange));

        };
    }
}
