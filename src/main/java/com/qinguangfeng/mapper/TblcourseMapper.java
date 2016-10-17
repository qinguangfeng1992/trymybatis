package com.qinguangfeng.mapper;

import com.qinguangfeng.entity.Tblcourse;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public interface TblcourseMapper {

    public   List<Tblcourse> selectCourAll();

    public   Tblcourse selectCourById(Serializable courseId);
    public List<Tblcourse> selectIf(Map map);
    public List<Tblcourse> selectTblIf(Tblcourse tblcourse);
    public  int  addCour(Tblcourse tblcourse);
    public  int updateCour(Tblcourse tblcourse);
    public  int deleteCour(Serializable courseId);
    Map



}
