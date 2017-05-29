package org.seckill.dao;

import org.seckill.model.SecondKill;

import java.util.Date;
import java.util.List;

/**
 * Created by OrangeKevin on 5/29/17.
 */
public interface SecondKillDao {

    int reduceNumber(long secKillId, Date killTime);

    SecondKill queryById(long secKillId);

    List<SecondKill> queryAll(int offset, int limit);

}
