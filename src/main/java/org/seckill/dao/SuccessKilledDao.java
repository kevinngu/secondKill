package org.seckill.dao;

import org.seckill.model.SuccessKill;

/**
 * Created by OrangeKevin on 5/29/17.
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(long secKillId, long userPhone);

    SuccessKill queryById(long secKillId);
}
