package com.medi.demoservice;

import org.springblade.core.cloud.feign.EnableBladeFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


/**
 * Desk启动器
 *
 * @author Chill
 */
@EnableBladeFeign
@SpringCloudApplication
// @SeataCloudApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

}
