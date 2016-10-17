package com.qinguangfeng.test;


import com.qinguangfeng.entity.Tblstudent;
import com.qinguangfeng.entity.TiaoJian;

import com.qinguangfeng.mapper.TblstudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * Created by Administrator on 2016/9/12.
 * 主要集中于设计到 Score表的 Juint的测试的相关方法
 */
public class TestStudent {
    //全局变量
    SqlSession sqlSession;
    TblstudentMapper tblstudentMapper;

    @Before//初始化
    public void init(){

        try {
            Reader reader= Resources.getResourceAsReader("peizhi.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            sqlSession=sqlSessionFactory.openSession();

            tblstudentMapper =sqlSession.getMapper(TblstudentMapper.class);



        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test//测试Choose的标签
    public void testSelectConCat(){
        TiaoJian tiaoJian=new TiaoJian();
        tiaoJian.setStuName("张");
        tiaoJian.setMaxAge(90);
        tiaoJian.setMinAge(10);
       tiaoJian.setGender("女");
        List<Tblstudent>list =tblstudentMapper.selectConCat(tiaoJian);
        for(Tblstudent tbl:list){
            System.out.println(tbl.getStuName());

        }


    }

    @Test//测试修改学生的方法
    public void testUpdateStu(){
        Tblstudent tblstudent=new Tblstudent();
        tblstudent.setStuId("1079");
        tblstudent.setStuName("梅基");
        tblstudent.setStuAge(18);
        tblstudent.setStuSex("女");
        tblstudent.setStuPwd("0000");
        try {
            sqlSession.update("com.qinguangfeng.mapper.TblstudentMapper.updateStu", tblstudent);

            sqlSession.commit();


        } catch (Exception e) {
            sqlSession.rollback();
        }

    }

    @Test//测试删除学生的方法
    public void testDeleteStu(){
        Tblstudent tblstudent=new Tblstudent();
        tblstudent.setStuId("1099");
 try {
            sqlSession.delete("com.qinguangfeng.mapper.TblstudentMapper.deleteStu", tblstudent);

            sqlSession.commit();


        } catch (Exception e) {
            sqlSession.rollback();
        }
    }

    @Test//测试增加学生的方法
    public void testAddStu(){
        Tblstudent tblstudent=new Tblstudent();
        tblstudent.setStuId("1055");
        tblstudent.setStuName("褒姒");
        tblstudent.setStuAge(16);
        tblstudent.setStuSex("女");
        tblstudent.setStuPwd("8888");

      /*  int result=  tblstudentMapper.addStu(tblstudent);
        System.out.println(result);*/
        Tblstudent tblstudent2=new Tblstudent();
        tblstudent2.setStuId("1055");
        tblstudent2.setStuName("褒姒");
        tblstudent2.setStuAge(16);
        tblstudent2.setStuSex("女");
        tblstudent2.setStuPwd("8888");


        try {
            sqlSession.insert("com.qinguangfeng.mapper.TblstudentMapper.addStu",tblstudent);
          //  sqlSession.insert("com.qinguangfeng.mapper.TblstudentMapper.addStu", tblstudent2);
            sqlSession.commit();


        } catch (Exception e) {
            sqlSession.rollback();
        }


    }






}
