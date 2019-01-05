package com.edwardy.po;

import java.util.Date;

/**
 * Created by yuminghua on 4/22/18.
 */
public class DoubleColor {
    private Integer Id;
    private Integer A;
    private Integer B;
    private Integer C;
    private Integer D;
    private Integer E;
    private Integer F;
    private Integer G;
    private Date CreateTime;
    private String Periods;
    private Date OpenTime;

    public void setId(Integer id) {
        Id = id;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }



    public void setOpenTime(Date openTime) {
        OpenTime = openTime;
    }

    public Integer getId() {
        return Id;
    }


    public String getPeriods() {
        return Periods;
    }

    public void setPeriods(String periods) {
        Periods = periods;
    }

    public Date getOpenTime() {
        return OpenTime;
    }

    public Integer getA() {
        return A;
    }

    public Integer getB() {
        return B;
    }

    public Integer getC() {
        return C;
    }

    public Integer getD() {
        return D;
    }

    public Integer getE() {
        return E;
    }

    public Integer getF() {
        return F;
    }

    public Integer getG() {
        return G;
    }

    public void setA(Integer a) {
        A = a;
    }

    public void setB(Integer b) {
        B = b;
    }

    public void setC(Integer c) {
        C = c;
    }

    public void setD(Integer d) {
        D = d;
    }

    public void setE(Integer e) {
        E = e;
    }

    public void setF(Integer f) {
        F = f;
    }

    public void setG(Integer g) {
        G = g;
    }
}
