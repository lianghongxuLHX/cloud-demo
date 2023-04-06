package cn.itcast.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 32424
 * Date:2023/3/31
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main (String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
