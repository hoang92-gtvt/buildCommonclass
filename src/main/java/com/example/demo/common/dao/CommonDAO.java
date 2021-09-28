package com.example.demo.common.dao;

import com.example.demo.common.sql.NCSqlTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDAO {
    @Autowired
    private NCSqlTemplate sqlTemplate;

    private static  final String SQLSTATEMENT="Common.DAO.";

     public  Integer selMaxNm(String code){
         return sqlTemplate.selectOne(SQLSTATEMENT+ "selMaxNm" , code);
     }
     public int increaseMaxNm(String code){
         return sqlTemplate.update(SQLSTATEMENT+ "increaseMaxNm", code);
     }
}
