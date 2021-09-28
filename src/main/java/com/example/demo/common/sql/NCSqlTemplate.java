package com.example.demo.common.sql;

import java.util.List;
import java.util.Map;

public abstract interface NCSqlTemplate {
    public abstract <T> T selectOne(String paramString);
    public abstract <T> T selectOne(String paramString, Object paramObject);

    public abstract <E> List<E> selectList(String paramString);
    public abstract <E> List<E> selectList(String paramString, Object paramObject);

    public abstract <K, V> Map<K,V> selectMap(String paramString1, String paramString2);
    public abstract <K, V> Map<K,V> selectMap(String paramString1, Object paramObject, String paramString2);

    public abstract int insert(String paramString, Object paramObject);
    public abstract int update(String paramString, Object paramObject);
    public abstract int delete(String paramString, Object paramObject);
    public abstract int delete(String paramString);

}
