package com.example.demo.common.sql;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class NCSqlSessionDaoSupport extends DaoSupport {
   @Autowired
   private SqlSession sqlSession ;
   private boolean externalSqlSession;

    @Override
    protected void checkDaoConfig() throws IllegalArgumentException {
        Assert.notNull(this.sqlSession,"Property'sqlSessionFactory'or 'sqlSessionTemplate' are required");
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        if(!this.externalSqlSession){
            this.sqlSession = new SqlSessionTemplate(sqlSessionFactory);
        }
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSession = sqlSessionTemplate;
        this.externalSqlSession = true;
    }

    public SqlSession getSqlSession(){
        return this.sqlSession;
    }


}
