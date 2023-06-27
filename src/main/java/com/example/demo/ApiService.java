package com.example.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    String url = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst?serviceKey=6zZfFkasEkgLqsokGB8s5EZ7zgXxdShQ7hMidHRXBSW9fIKQ2LscXjWwOBmkp%2FABrBLbxecMfVS1x7yh9653DQ%3D%3D&numOfRows=5&pageNo=1&base_date=20230627&base_time=0500&nx=55&ny=127&dataType=JSON";
    public String callApi() {
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet httpGet = new HttpGet(url);
            HttpResponse httpResponse = httpClient.execute(httpGet);
            String response = EntityUtils.toString(httpResponse.getEntity());

            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
