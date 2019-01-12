package com.jojo.subjectmanager.UI;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;

import com.jojo.subjectmanager.R;
import com.jojo.subjectmanager.database.Appdatabase;
import com.jojo.subjectmanager.database.dao.courseDao;
import com.jojo.subjectmanager.database.table.courseEntity;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private List<courseEntity> courseEntityList =new ArrayList<>();
    int clock=0;
    CheckBox checkBox;
    courseEntity courseEntity = new courseEntity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        init();
        checkBox =findViewById(R.id.clock);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clock==0){
                    clock=1;
                }else {clock=0;}
            }
        });
    }
    //初始化，获得课程列表
    private void init(){
        Appdatabase appdatabase=Appdatabase.getInstance();

        courseDao courseDao =appdatabase.getcourseDao();
        courseEntityList= courseDao.getAll();
        CourseAdapter courseAdapter = new CourseAdapter(MainActivity.this,R.layout.listview_course_layout,courseEntityList);
        ListView listView= findViewById(R.id.listview);
        listView.setAdapter(courseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               courseEntity = courseEntityList.get(position);
            }
        });
    }
}
