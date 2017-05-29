package org.seckill.model;

import java.util.Date;

/**
 * Created by OrangeKevin on 5/29/17.
 */
public class SuccessKill {

    private long secondKillId;

    private long userPhone;

    private short state;
    
    private Date createTime;

    private SecondKill secondKill;

    public SecondKill getSecondKill() {
        return secondKill;
    }

    public void setSecondKill(SecondKill secondKill) {
        this.secondKill = secondKill;
    }

    public long getSecondKillId() {
        return secondKillId;
    }

    public void setSecondKillId(long secondKillId) {
        this.secondKillId = secondKillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
