package com.xzc.mlshop.entity;

public class Msg {
    private String msg;
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "Msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}
