package com.codefarm.logging.config;

import com.codefarm.logging.RequestLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "custom.config.enabled", havingValue = "true", matchIfMissing = true)
public class LoggerAutoConfig {
    private final Logger logger = LoggerFactory.getLogger(LoggerAutoConfig.class);
    @Bean
    RequestLogger requestLogger(){
        logger.info("Instantiating RequestLogger ..");
        return new RequestLogger();
    }
}
