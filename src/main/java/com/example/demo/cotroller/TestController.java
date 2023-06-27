package com.example.demo.cotroller;

import com.example.demo.ApiService;
import com.example.demo.dto.Response;
import com.example.demo.dto.ResponseData;
import com.example.demo.dto.ResponseHeader;
import com.example.demo.test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
    @Autowired private ApiService apiService;

    @GetMapping("/api")
    public ResponseEntity<String> getApiResponse() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseData response = objectMapper.readValue(apiService.callApi(), ResponseData.class);
        return ResponseEntity.ok(response.getResponse().getHeader().getResultCode());
    }

}
