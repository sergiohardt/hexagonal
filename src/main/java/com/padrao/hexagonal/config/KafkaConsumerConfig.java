package com.padrao.hexagonal.config;

import com.padrao.hexagonal.adapters.in.consumer.mensager.CustomerMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, CustomerMessage> consumerFactory(){
        Map<String, Object> props = new HashMap<>();
    }
}
