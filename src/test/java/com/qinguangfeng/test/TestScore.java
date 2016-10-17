package com.qinguangfeng.test;

import com.qinguangfeng.entity.Tblscore;
import com.qinguangfeng.mapper.TblscoreMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by Administrator on 2016/9/12.
 * 主要集中于设计到 Score表的 Juint的测试的相关方法
 */
public class TestScore {
    //全局变量
    SqlSession sqlSession;
    TblscoreMapper tblscoreMapper;

    @Before//初始化
    public void init(){

        try {
            Reader reader= Resources.getResourceAsReader("peizhi.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            sqlSession=sqlSessionFactory.openSession();

            tblscoreMapper =sqlSession.getMapper(TblscoreMapper.class);



        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test//测试Choose的标签
    public void testSelectChoose(){
      // Tblscore tblscore =new Tblscore();

        List<Tblscore> list=tblscoreMapper.selectChoose(3);
        for( Tblscore tbl :list){

            System.out.println(tbl.getScore());

        }

    }

    @Test//测试selecetAll的方法
    public void testSelectScoAll(){
        List<Tblscore> list=tblscoreMapper.selectScoAll();
        for(Tblscore tbl:list){
            System.out.println(tbl.getScore());



        }

    }






}
