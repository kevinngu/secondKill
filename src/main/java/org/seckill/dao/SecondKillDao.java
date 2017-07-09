package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.model.SecondKill;

import java.util.Date;
import java.util.List;

/**
 * Created by OrangeKevin on 5/29/17.
 * add unit test: command + shift + t
 */
public interface SecondKillDao {

    int reduceNumber(long secKillId, Date killTime);

    SecondKill queryById(long secKillId);

    List<SecondKill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
