package com.example.trf_custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] title={"title1","title2","title3","title4","title5","title6","title7","title8","title9","title10"};
    String[] subtitle={"Subtitle1","Subtitle2","Subtitle3","Subtitle4","Subtitle5","Subtitle6","Subtitle7","Subtitle8","Subtitle9","Subtitle10"};
    Integer[] imgNo={android.R.drawable.ic_lock_idle_alarm,R.drawable.group2,android.R.drawable.ic_media_pause,android.R.drawable.ic_media_next,android.R.drawable.ic_menu_send,R.drawable.group1,R.drawable.woman2,R.drawable.woman4,R.drawable.man3,R.drawable.man};
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customadapter=new CustomAdapter(this,title,subtitle,imgNo);
        listview=findViewById(R.id.listview);
        listview.setAdapter(customadapter);


    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }


    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}