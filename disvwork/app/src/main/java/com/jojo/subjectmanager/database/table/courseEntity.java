package com.jojo.subjectmanager.database.table;



import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "course")
public class courseEntity {

    @PrimaryKey(autoGenerate = true)
    private int coursenum;
    @ColumnInfo
    private String coursename;
    @ColumnInfo
    private String teacher;
    @ColumnInfo
    private String starttime;
    @ColumnInfo
    private String endtime;
    @ColumnInfo
    private int clock;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) { this.coursename = coursename; }

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

    public String getStarttime() { return starttime; }

    public void setStarttime(String starttime) { this.starttime = starttime; }

    public String getEndtime() { return endtime; }

    public void setEndtime(String endtime) { this.endtime = endtime; }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }
}
