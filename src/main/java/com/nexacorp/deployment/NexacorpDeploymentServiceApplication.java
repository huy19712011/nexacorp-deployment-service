package com.nexacorp.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class NexacorpDeploymentServiceApplication {

    public static void main(String[] args) {

        // The host default zone (Asia/Saigon) is rejected by PostgreSQL as a session TimeZone
        // during connection startup; use the canonical zone ID instead.
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        SpringApplication.run(NexacorpDeploymentServiceApplication.class, args);

        System.out.println("running...");
    }

}
