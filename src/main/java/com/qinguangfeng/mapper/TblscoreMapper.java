package com.qinguangfeng.mapper;

import com.qinguangfeng.entity.Tblscore;
import org.apache.ibatis.annotations.Param;


import java.io.Serializable;
import java.util.List;


public interface TblscoreMapper {

  public   List<Tblscore> selectScoAll();
    public   Tblscore selectById(Serializable pkScore);
  public   List<Tblscore> selectChoose(@Param("sco") int sco);


    public  int  addSco(Tblscore tblscore);
    public  int updateSco(Tblscore tblscore);
    public  int deleteSco(Serializable pkScore);



}
