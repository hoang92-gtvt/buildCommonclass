package com.example.demo.common.svc;

import com.example.demo.common.baseModel.NCCommonSVO;

import java.util.List;

public interface NCCommonSerVice {
    //phuong thuc chung lay ra loai doi tuong
    String getType();

    //phuong thuc chung lay ra list doi tuong
    List<NCCommonSVO> selList(NCCommonSVO param);

}
