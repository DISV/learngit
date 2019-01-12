package com.jojo.subjectmanager.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.jojo.subjectmanager.R;
import com.jojo.subjectmanager.database.table.courseEntity;


import java.util.List;

import static com.jojo.subjectmanager.R.id.clock;

public class CourseAdapter extends ArrayAdapter<courseEntity> {
    private int resourceId;
    public CourseAdapter(Context context, int textViewResourceId, List<courseEntity> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
   /* @Override
    public int getCount() {
        return courseEntityList ==null?0: courseEntityList.size();
    }

    @Override
    public Object getItem(int position) {
        return courseEntityList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
*/
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        courseEntity courseEntity =getItem(position);
        View view;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        }else {
            view=convertView;
        }
        TextView clock = view.findViewById(R.id.clock);
        TextView course=view.findViewById(R.id.courseEntity);
        TextView starttime=view.findViewById(R.id.start);
        course.setText(courseEntity.getCoursename());
        starttime.setText(courseEntity.getStarttime());
        clock.setText(courseEntity.getClock());
        return view;
    }
}
