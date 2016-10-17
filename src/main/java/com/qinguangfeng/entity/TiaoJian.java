package com.qinguangfeng.entity;

/**
 * Created by Administrator on 2016/9/12.
 * 用来猜测 用户可能输入的内容
 */
public class TiaoJian {
    private String stuName;
    private Integer maxAge;
    private Integer minAge;
    private  String gender;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
