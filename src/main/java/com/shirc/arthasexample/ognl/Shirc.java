package com.shirc.arthasexample.ognl;

/**
 * 公众号: 进击的老码农
 */
public class Shirc {

    private String name;

    private boolean flag;

    public Shirc() {
    }

    public Shirc(String name, boolean flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
