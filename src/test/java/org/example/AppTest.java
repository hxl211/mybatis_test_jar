package org.example;


import Utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Car;

import java.util.List;

public class AppTest {

    @Test
public void appTest(){
        System.out.println("2.0");
        System.out.println("hot-fix");
        System.out.println("master1.0");
        System.out.println("hot-fix-2");
        System.out.println("第二次");
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Car car = new Car(null, 11, "奔驰", 20.00, "2023-01-07", "燃油车");
        sqlSession.insert("ins",car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDel(){
        SqlSession sqlSession=SqlSessionUtil.openSession();
        int count = sqlSession.delete("del", 33);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUp(){
        SqlSession sqlSession=SqlSessionUtil.openSession();
        Car car = new Car(29L, 10, "奥迪", 16.00, "2019-10-01", "电动车");
        sqlSession.update("upd",car);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSel(){
        SqlSession sqlSession=SqlSessionUtil.openSession();
        Object sel = sqlSession.selectOne("sel", 1);
        System.out.println(sel);
        sqlSession.close();
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession=SqlSessionUtil.openSession();
        List<Object> sel1 = sqlSession.selectList("sel1");
        for(Object o :sel1){
            System.out.println(o);
        }
        sqlSession.close();
    }
}
