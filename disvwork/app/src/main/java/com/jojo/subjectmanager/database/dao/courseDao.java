package com.jojo.subjectmanager.database.dao;



import com.jojo.subjectmanager.database.table.courseEntity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface courseDao {
    @Query("select * from course")
    List<courseEntity> getAll();

    @Query("select  * from course where coursenum = :coursenum ")
    courseEntity getOne(int coursenum);

    @Insert
    void add(courseEntity entity);

    @Delete
    void delete(courseEntity entity);

    @Update
    void update(courseEntity entity);
}
