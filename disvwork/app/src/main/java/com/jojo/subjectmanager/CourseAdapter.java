package com.jojo.subjectmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CourseAdapter extends BaseAdapter {
    private List<course> courseList;
    private LayoutInflater inflater;
    public CourseAdapter(List<course> coursesList,Context context) {
        this.courseList = coursesList;
        this.inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return courseList==null?0:courseList.size();
    }

    @Override
    public Object getItem(int position) {
        return courseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SimpleDateFormat formatter   = new   SimpleDateFormat( "hh:mm");
        View view=inflater.inflate(R.layout.listview_course_layout,null);
        course course= (com.jojo.subjectmanager.course) getItem(position);
        TextView coursename=view.findViewById(R.id.course);
        TextView starttime=view.findViewById(R.id.start);
        String date = formatter.format(course.getStarttime());
        coursename.setText(course.getCoursename());
        starttime.setText(date);
        return view;
    }
}
