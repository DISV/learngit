package com.jojo.subjectmanager.App;

import android.app.Application;

import com.jojo.subjectmanager.database.Appdatabase;

public class App extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Appdatabase.init(this);
    }
}
