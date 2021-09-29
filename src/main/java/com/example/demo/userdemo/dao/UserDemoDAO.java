package com.example.demo.userdemo.dao;

import com.example.demo.common.baseModel.NCCommonSVO;
import com.example.demo.common.sql.NCSqlTemplate;
import com.example.demo.userdemo.svo.UsersDemo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDemoDAO {
    @Autowired
    @Qualifier("sqlTemplate")
    private NCSqlTemplate sqlTemplate;

    private static  final String SQLSTATEMENT="UserDemoDAO.";

    public List<NCCommonSVO> selectList(NCCommonSVO param){
        return sqlTemplate.selectList(SQLSTATEMENT+"selList", param);
    }

//
//    public UsersDemo selectById(String id){
//        return sqlTemplate.selectOne(SQLSTATEMENT + "findById", id);
//    }

}
