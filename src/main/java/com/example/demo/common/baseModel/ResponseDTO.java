package com.example.demo.common.baseModel;

import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private boolean success;
    private Object data;
}
