package com.Alexa.Springboot_Alexa.controller;

import com.Alexa.Springboot_Alexa.service.AlexaService;
//import com.amazon.ask.AlexaSkill;
import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
//import com.amazon.ask.model.Request;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.ResponseEnvelope;
import com.amazon.ask.request.handler.GenericRequestHandler;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.apache.catalina.Valve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AlexaController {
    private static final String EXPECTED_SKILL_ID = "amzn1.ask.skill.d427515b-bb37-474d-bbb1-08cda1af281f";

    private final Skill alexaSkill;
    @Autowired
    public AlexaController(Skill alexaSkill) {
        this.alexaSkill = alexaSkill;
    }

//    @PostMapping("/alexa")
//    public ResponseEnvelope alexaRequest(@RequestBody RequestEnvelope request) {
//        RequestEnvelope input = HandlerInput.builder().withRequestEnvelope(request).build().getRequestEnvelope();
//        return alexaSkill.invoke(input);
//    }





    @PostMapping("/alexa")
    public Response alexaRequest(@RequestBody RequestEnvelope request) {

        HandlerInput input = HandlerInput.builder()
                .withRequestEnvelope(request)
                .build();
        ResponseEnvelope response = alexaSkill.invoke(request);
        return response.getResponse(); // Returning just the response part
    }







}




