package practice.dto;

import java.util.Date;

public class DTO1 {
    private String sId;
    private String sName;
    private Date sAge;
    private String sSex;

    private Float score1;
    private Float score2;

    @Override
    public String toString() {
        return "DTO1{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex='" + sSex + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                '}';
    }

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

    public Float getScore1() {
        return score1;
    }

    public void setScore1(Float score1) {
        this.score1 = score1;
    }

    public Float getScore2() {
        return score2;
    }

    public void setScore2(Float score2) {
        this.score2 = score2;
    }
}
