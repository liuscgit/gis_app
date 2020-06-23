package com.survey.schd.myapplication.pile_activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.survey.schd.myapplication.MainActivity;
import com.survey.schd.myapplication.R;

public class PileSelector extends AppCompatActivity {
    private AutoScrollViewPager viewPager ;
    private ViewPagerAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pile);

//        showCustomizeDialog();

//        viewPager = (AutoScrollViewPager) findViewById(R.id.viewpager);
//        adapter = new ViewPagerAdapter(this);
//        viewPager.setAdapter(adapter);
//        viewPager.setAutoPlay(true);
    }

//    private void showCustomizeDialog() {
//        AlertDialog.Builder alterDiaglog = new AlertDialog.Builder(MainActivity.this);
//        alterDiaglog.setView(R.layout.activity_pile);//加载进去
//        AlertDialog dialog = alterDiaglog.create();
//        //显示
//        dialog.show();
//        viewPager = (AutoScrollViewPager) findViewById(R.id.viewpager);
//        adapter = new ViewPagerAdapter(this);
//        viewPager.setAdapter(adapter);
//        viewPager.setAutoPlay(true);
//    }

}
