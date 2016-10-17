package com.qinguangfeng.mapper;

import com.qinguangfeng.entity.Tblteacher;

import java.io.Serializable;
import java.util.List;

public interface TblteacherMapper {

    public   List<Tblteacher> selectTeaAll();
    public   Tblteacher selectTeaById(Serializable teaId);
    public  int  addTea(Tblteacher tblteacher);
    public  int updateTea(Tblteacher tblteacher);
    public  int deleteTea(Serializable teaId);



}
