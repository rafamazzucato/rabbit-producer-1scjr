package br.com.fiap.scjr.rabbitproducer.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

    @Value("${queue.fiap}")
    private String name;

    @Bean
    public Queue queue(){ return new Queue(name, true);}
}
