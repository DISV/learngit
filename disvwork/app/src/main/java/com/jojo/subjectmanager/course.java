package com.jojo.subjectmanager;

import java.util.Date;

public class course {
    private String coursename;
    private int coursenum;
    private String teacher;
    private Date starttime;
    private Date endtime;
    private boolean clock;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(int coursenum) {
        this.coursenum = coursenum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public boolean isClock() {
        return clock;
    }

    public void setClock(boolean clock) {
        this.clock = clock;
    }
}
