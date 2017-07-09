package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.model.SecondKill;
import org.springframework.test.annotation.SystemProfileValueSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by OrangeKevin on 7/9/17.
 */
//junit启动时加载SpringIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SecondKillDaoTest {

    @Resource
    private SecondKillDao secondKillDao;

    @Test
    public void reduceNumber() throws Exception {
        long id = 1000;
        SecondKill secondKill = secondKillDao.queryById(id);
        System.out.println(secondKill.getName());
    }

    @Test
    public void queryById() throws Exception {

    }

    @Test
    public void queryAll() throws Exception {

    }

}