package com.qinguangfeng.mapper;

import com.qinguangfeng.entity.Tblstudent;
import com.qinguangfeng.entity.TiaoJian;

import java.io.Serializable;
import java.util.List;


public interface TblstudentMapper {

  public   List<Tblstudent> selectAll();
    public   Tblstudent selectById(Serializable stuid);
  public   List<Tblstudent> selectConCat(TiaoJian tiaoJian);

    public  int  addStu(Tblstudent tblstudent);
    public  int updateStu(Tblstudent tblstudent);
    public  int deleteStu(Serializable stuid);



}
