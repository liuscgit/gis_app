package com.survey.schd.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.survey.schd.myapplication.pile_activity.AutoScrollViewPager;
import com.survey.schd.myapplication.pile_activity.PileSelector;
import com.survey.schd.myapplication.pile_activity.ViewPagerAdapter;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button linebutton;
    private Button pointbutton;
    private Button polygonbutton;
    private Button pilebutton;
    private AutoScrollViewPager viewPager ;
    private ViewPagerAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button1.setBackgroundResource(R.drawable.ic_area);
        button1.setOnClickListener(clickListener);

        button2 = findViewById(R.id.btn2);
//        button2.setBackgroundResource(R.drawable.ic_area);
        button2.setOnClickListener(clickListen);

        button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(clickListener1);

        button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(clickListenerslope);

        button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(clickListenerbadgeology);

        button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(clickListenerslope);

        linebutton =  findViewById(R.id.linebtn);
        linebutton.setOnClickListener(clickListenerlinesymbol);

        pointbutton = findViewById(R.id.pointbtn);
        pointbutton.setOnClickListener(clickListenerpointsymbol);

        polygonbutton = findViewById(R.id.polygonbtn);
        polygonbutton.setOnClickListener(clickListenerpolygonsymbol);

        pilebutton = findViewById(R.id.pilebtn);
        pilebutton.setOnClickListener(clickListenerpile);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TableActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TableGeologySurveyActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TableGeoSurveyActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListenerslope = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TableSlopeSurveyActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListenerbadgeology = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TableBadGeology.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListenerlinesymbol = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, LineSymbolSelectActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListenerpointsymbol = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, PointSymbolSelectActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListenerpolygonsymbol = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, PolygonSymbolSelectActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener clickListenerpile = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Intent intent = new Intent();
//            intent.setClass(MainActivity.this, PileSelector.class);
//            startActivity(intent);
            showCustomizeDialog();
        }
    };

    private void showCustomizeDialog() {
        AlertDialog.Builder alterDiaglog = new AlertDialog.Builder(MainActivity.this);
        alterDiaglog.setView(R.layout.activity_pile);//加载进去
        AlertDialog dialog = alterDiaglog.create();
//        setContentView(R.layout.activity_pile);
//        viewPager = (AutoScrollViewPager) findViewById(R.id.viewpager);
//        adapter = new ViewPagerAdapter(this);
//        viewPager.setAdapter(adapter);
//        viewPager.setAutoPlay(true);
        //显示
        dialog.show();
    }

}
