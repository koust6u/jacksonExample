package com.example.demo;

import com.example.demo.dto.Response;
import com.example.demo.dto.ResponseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@Service
public class test {


    private RestTemplate restTemplate = new RestTemplate();

    public Response callExternalApi() {
        String apiUrl = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst?serviceKey=6zZfFkasEkgLqsokGB8s5EZ7zgXxdShQ7hMidHRXBSW9fIKQ2LscXjWwOBmkp%2FABrBLbxecMfVS1x7yh9653DQ%3D%3D&numOfRows=1000&pageNo=1&base_date=20230627&base_time=0500&nx=55&ny=127&dataType=JSON";
        ResponseEntity<Response> responseEntity = restTemplate.getForEntity(apiUrl, Response.class);
        return responseEntity.getBody();
    }



}
