package com.qinguangfeng.entity;

import java.io.Serializable;
import java.util.List;


/**
 * @author qinguangfeng
 */
public class Tblteacher implements Serializable {

   private String teaId;

    private String teaName;

    private List<Tblcourse> tblcourseList;

    public List<Tblcourse> getTblcourseList() {
        return tblcourseList;
    }

    public void setTblcourseList(List<Tblcourse> tblcourseList) {
        this.tblcourseList = tblcourseList;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }
}