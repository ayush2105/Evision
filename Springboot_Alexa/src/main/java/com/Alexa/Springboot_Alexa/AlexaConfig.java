package com.Alexa.Springboot_Alexa;

import com.Alexa.Springboot_Alexa.service.AlexaService;
import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AlexaConfig {
    @Bean
    public Skill alexaSkill() {
        return Skills.standard()
                .addRequestHandlers(new AlexaService())
                .build();
    }
}
