package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResponseItems {

    @JsonProperty("item")
    private List<ResponseItem> item;
}
