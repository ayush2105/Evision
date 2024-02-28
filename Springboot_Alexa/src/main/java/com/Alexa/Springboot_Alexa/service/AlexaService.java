package com.Alexa.Springboot_Alexa.service;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
//import com.amazon.speech.slu.Intent;
//import com.amazon.speech.speechlet.IntentRequest;
import com.amazonaws.handlers.AbstractRequestHandler;
//import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AlexaService implements RequestHandler {

    public boolean canHandle(HandlerInput handlerInput){
        return true;
    }
    public Optional<Response> handle(HandlerInput handlerInput){
        String speech="This a Response";
        return handlerInput.getResponseBuilder().withSpeech(speech).build();
    }







}
