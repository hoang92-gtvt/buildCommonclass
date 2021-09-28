package com.example.demo.common.ctl;

import com.example.demo.common.Constant;
import com.example.demo.common.baseModel.NCCommonSVO;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.IllegalArgumentException;

public class CommonCTL {

    protected Map< String, Object> hadlePagination(NCCommonSVO ivo, List<NCCommonSVO> resultList) {
        if (null == ivo) {
            throw new IllegalArgumentException();
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(Constant.PAGE, ivo.getPage());
        if (resultList != null && resultList.size() > 0) {
            resultMap.put(Constant.TOTAL, resultList.get(0).getTotal());
            resultMap.put(Constant.RECORDS, resultList.get(0).getRecords());
            resultMap.put(Constant.ROWS, resultList);
        }
        return resultMap;
    }
}
