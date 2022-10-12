package com.linjingc.mqttTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MqttApplication {

    public static void main(String[] args) {
        log.info("MQTT连接启动....");
        SpringApplication.run(MqttApplication.class, args);
    }

}
