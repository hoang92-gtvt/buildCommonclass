package com.example.demo.userdemo.svo;

import com.example.demo.common.baseModel.NCCommonSVO;
import lombok.Data;

import java.util.Date;
@Data
public class UsersDemo extends NCCommonSVO {
    private Long id;
    private String name;
    private String password;
    private Date time;
}
