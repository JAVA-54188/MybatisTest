package org.mybatis.practice;

import java.util.Date;

public class Student {
    private String sId;
    private String sName;
    private Date sAge;
    private String sSex;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getsAge() {
        return sAge;
    }

    public void setsAge(Date sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }
}
