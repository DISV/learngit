package com.jojo.subjectmanager.database;

import android.app.Application;


import com.jojo.subjectmanager.database.dao.courseDao;
import com.jojo.subjectmanager.database.table.courseEntity;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {courseEntity.class},version = 1 ,exportSchema = false)
public abstract class Appdatabase extends RoomDatabase {

    private static final String databaseName="disv";
    private static Appdatabase sInstance;
    public static void init(Application application){
        if(sInstance==null){
            synchronized (Appdatabase.class){
                if (sInstance==null){
                    sInstance = Room.databaseBuilder(application,Appdatabase.class,databaseName).build();
                }
            }
        }
    }
    public static Appdatabase getInstance(){
        synchronized (Appdatabase.class){
            if(sInstance==null){
                throw new NullPointerException("database is null");
            }
        }
        return sInstance;
    }
    public abstract courseDao getcourseDao();
}
