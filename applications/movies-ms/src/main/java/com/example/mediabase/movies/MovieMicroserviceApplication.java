package com.example.mediabase.movies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@SpringBootApplication
public class MovieMicroserviceApplication  {

    public static void main(String... args) {
        SpringApplication.run(MovieMicroserviceApplication.class, args);
    }


}
