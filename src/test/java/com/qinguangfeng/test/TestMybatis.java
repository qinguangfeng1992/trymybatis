package com.qinguangfeng.test;

import com.qinguangfeng.entity.Tblcourse;
import com.qinguangfeng.entity.Tblstudent;
import com.qinguangfeng.entity.Tblteacher;
import com.qinguangfeng.mapper.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestMybatis {
    //全局变量
    SqlSession sqlSession;
    TblcourseMapper tblcourseMapper;
    TblstudentMapper tblstudentMapper;
    TblteacherMapper tblteacherMapper;





    @Before//初始化
    public void init() {
        try {
            Reader reader = Resources.getResourceAsReader("peizhi.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();

            tblcourseMapper = sqlSession.getMapper(TblcourseMapper.class);
            tblstudentMapper = sqlSession.getMapper(TblstudentMapper.class);
            tblteacherMapper = sqlSession.getMapper(TblteacherMapper.class);




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test//测试连接
    public void testConn() {
        try {
            Reader reader = Resources.getResourceAsReader("peizhi.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            System.out.println(sqlSession);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test//测试学生表 查询全部
    public void testStuAll() {
        try {
             List<Tblstudent> list = sqlSession.selectList("com.qinguangfeng.mapper.TblstudentMapper.selectAll");
            for (Tblstudent tblstudent : list) {
                System.out.println(tblstudent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test//测试学生表 查询全部
    public void testStuSelectAll() {
        try {
            List<Tblstudent> list = sqlSession.selectList("com.qinguangfeng.mapper.TblstudentMapper.selectAll");
            for (Tblstudent tblstudent : list) {
                System.out.println(tblstudent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test//课程实体类 加入 教师类

    public void testCourseAll() {
        try {
            List<Tblcourse> list = tblcourseMapper.selectCourAll();
            for (Tblcourse tblcourse : list) {
                  System.out.println(tblcourse.getTblteacher().getTeaName()+"：所教课程："+tblcourse.getCourseName());
           }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test

    public void testAll() {
        try {
            List<Tblteacher> list = tblteacherMapper.selectTeaAll();
                for (Tblteacher tblteacher : list) {
                      List<Tblcourse> list1 =tblteacher.getTblcourseList();
                         for (Tblcourse tblcourse:list1){

                                 System.out.println(tblteacher.getTeaName()+"：所教课程："+tblcourse.getCourseName());

                 }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
        public void testFindIf(){
            Map p=new HashMap();
            p.put("courseId","001");
            p.put("courseName","企业管理");
            List<Tblcourse> list=tblcourseMapper.selectIf(p);

            for (Tblcourse tblcourse:list){
                System.out.println(tblcourse.getCourseName());

            }

    }
        @Test
        public void selectTblIf() {
            Tblcourse tblcourse = new Tblcourse();


            tblcourse.setCourseName("李");
            List<Tblcourse> list = tblcourseMapper.selectTblIf(tblcourse);

            for (Tblcourse tbl : list) {
                System.out.println(tbl.getCourseName());

            }


        }
}
