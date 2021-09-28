package com.example.demo.common.baseModel;

import lombok.Data;

@Data
public class NCCommonSVO {
    private static final Long serialVersionUID = -7302306805298756490L;
    private int row=15;
    private int page= 1;
    private int records;
    private int total;
    private int clsfCode;
    private int rank;
    private String rowId;
    private String keyWord;


    private String regntId;
    private String regnNm;
    private String regDtm;


    private String lstTrtrId;
    private String lstTrtrNm;
    private String lstTrtrDtm;


    private String ssUserId;
    private String ssUserNm;
    private String ssEno;


    private String whlPath;
    private String rowkey;


    private String cd;
    private String cdm;





}
