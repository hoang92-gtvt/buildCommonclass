package com.example.demo.common.sql;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component ("sqlTemplate")
public class NCMybatisSqlTemplate implements NCSqlTemplate{
    @Autowired
    private NCSqlSessionDaoSupport sqlSessionDaoSupport;

    public NCSqlSessionDaoSupport getSqlSessionDaoSupport() {
        return sqlSessionDaoSupport;
    }

    public void setSqlSessionDaoSupport(NCSqlSessionDaoSupport sqlSessionDaoSupport) {
        this.sqlSessionDaoSupport = sqlSessionDaoSupport;
    }

    @Override
    public <T> T selectOne(String paramString) {
        return (T) this.sqlSessionDaoSupport.getSqlSession().selectOne(paramString);
    }

    @Override
    public <T> T selectOne(String paramString, Object paramObject) {
        return (T) this.sqlSessionDaoSupport.getSqlSession().selectOne(paramString, paramObject);
    }

    @Override
    public <E> List<E> selectList(String paramString) {
        return  this.sqlSessionDaoSupport.getSqlSession().selectList(paramString);
    }

    @Override
    public <E> List<E> selectList(String paramString, Object paramObject) {
        return  this.sqlSessionDaoSupport.getSqlSession().selectList(paramString, paramObject);
    }

    @Override
    public <K, V> Map<K, V> selectMap(String paramString1, String paramString2) {
        return  this.sqlSessionDaoSupport.getSqlSession().selectMap(paramString1, paramString2);
    }

    @Override
    public <K, V> Map<K, V> selectMap(String paramString1, Object paramObject, String paramString2) {
        return  this.sqlSessionDaoSupport.getSqlSession().selectMap(paramString1,paramObject, paramString2);
    }

    @Override
    public int insert(String paramString, Object paramObject) {
        return  this.sqlSessionDaoSupport.getSqlSession().insert(paramString, paramObject);
    }

    @Override
    public int update(String paramString, Object paramObject) {
        return  this.sqlSessionDaoSupport.getSqlSession().update(paramString, paramObject);
    }

    @Override
    public int delete(String paramString, Object paramObject) {
        return  this.sqlSessionDaoSupport.getSqlSession().delete(paramString, paramObject);
    }

    @Override
    public int delete(String paramString) {
        return  this.sqlSessionDaoSupport.getSqlSession().delete(paramString);
    }




}
