package org.nexters.cultureland;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CultureLandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CultureLandApplication.class, args);
    }

}
