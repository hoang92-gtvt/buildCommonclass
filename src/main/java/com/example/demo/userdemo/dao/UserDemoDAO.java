package com.example.demo.userdemo.dao;

import com.example.demo.common.baseModel.NCCommonSVO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDemoDAO {

    public List<NCCommonSVO> findAll();

}
