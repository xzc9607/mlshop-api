package com.xzc.mlshop.entity;

public class Order {
    private int id;
    private int userid;
    private int carid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userid=" + userid +
                ", carid=" + carid +
                '}';
    }
}
