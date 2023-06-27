package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBody {
    @JsonProperty("dataType")
    private String dataType;
    @JsonProperty("items")
    private ResponseItems items;

    public ResponseItems getItems() {
        return items;
    }

    public void setItems(ResponseItems items) {
        this.items = items;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }


}
