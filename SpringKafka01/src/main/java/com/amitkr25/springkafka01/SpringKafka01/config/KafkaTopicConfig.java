package com.amitkr25.springkafka01.SpringKafka01.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    NewTopic newTopic() {
        return TopicBuilder.name("topic01")
                .build();
    }
}
