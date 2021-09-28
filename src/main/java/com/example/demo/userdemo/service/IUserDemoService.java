package com.example.demo.userdemo.service;

import com.example.demo.common.baseModel.NCCommonSVO;
import com.example.demo.common.svc.NCCommonSerVice;
import com.example.demo.userdemo.svo.UsersDemo;

public interface IUserDemoService extends NCCommonSerVice {
    UsersDemo getOne(String paramString);
}
