package io.github.khietbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SesameConfigService {

    public static void main(String[] args) {
        SpringApplication.run(SesameConfigService.class, args);
    }
}