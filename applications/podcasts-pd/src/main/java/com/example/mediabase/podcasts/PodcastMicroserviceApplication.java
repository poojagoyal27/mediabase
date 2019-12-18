package com.example.mediabase.podcasts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PodcastMicroserviceApplication  {

    public static void main(String... args) {
        SpringApplication.run(PodcastMicroserviceApplication.class, args);
    }


}
