package com.qinguangfeng.entity;

import java.io.Serializable;

/**课程实体类 加入 教师类
 * @author qinguangfeng
 */
public class Tblcourse implements Serializable {

    private String courseId;

    private String courseName;

    private  String teaId;

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    private Tblteacher tblteacher;
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Tblteacher getTblteacher() {
        return tblteacher;
    }

    public void setTblteacher(Tblteacher tblteacher) {
        this.tblteacher = tblteacher;
    }
}