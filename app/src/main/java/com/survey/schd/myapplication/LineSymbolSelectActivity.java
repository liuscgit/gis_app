package com.survey.schd.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.esri.arcgisruntime.symbology.SimpleLineSymbol;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineSymbolSelectActivity extends AppCompatActivity {

    private ImageButton linedashButton;
    private ImageButton linedashdotButton;
    private ImageButton linedotButton;
    private ImageButton linesolidButton;
    private ImageButton linedashdotdotButton;
    private EditText widthValue;
    private List<ImageButton> aaa = new ArrayList<>();
    private  SimpleLineSymbol.Style lineStyle;
    private String lineWidth;
    private ColorPickerView colorpick;
    int selectedColor;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linesymbol_selector);
        System.out.print("111111");

        linedashButton =  findViewById(R.id.line_dash);
        linedashdotButton = findViewById(R.id.line_dash_dot);
        linedotButton = findViewById(R.id.line_dot);
        linesolidButton = findViewById(R.id.line_solid);
        linedashdotdotButton = findViewById(R.id.line_dash_dot_dot);
        widthValue = findViewById(R.id.widthValue);
        colorpick = findViewById(R.id.line_color_picker_view);

        linedashButton.setOnClickListener(clickLinedash);
        linedashdotButton.setOnClickListener(clickLinedashdot);
        linedotButton.setOnClickListener(clickLinedot);
        linesolidButton.setOnClickListener(clickLinesolid);
        linedashdotdotButton.setOnClickListener(clickLinedotdot);
        widthValue.setOnClickListener(clickwidthValue);

        colorpick.setOnClickListener(sss);

//        selectedColor = colorpick.getSelectedColor();
//        colorpick.setOnColorSelectedListener(new OnColorSelectedListener() {
//            @Override
//            public void onColorSelected(int selectedColor) {
//                toast("onColorSelected: 0x" + Integer.toHexString(selectedColor));
//            }
//        });

    }

    View.OnClickListener clickLinedash = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            v.getId();
            System.out.print(v.getId());
            lineStyle = SimpleLineSymbol.Style.DASH;
            System.out.print("111111");
        }
    };

    View.OnClickListener clickLinedashdot = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lineStyle = SimpleLineSymbol.Style.DASH_DOT;
        }
    };

    View.OnClickListener clickLinedot = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lineStyle = SimpleLineSymbol.Style.DOT;
        }
    };

    View.OnClickListener clickLinesolid = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lineStyle = SimpleLineSymbol.Style.SOLID;
        }
    };

    View.OnClickListener clickLinedotdot = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lineStyle = SimpleLineSymbol.Style.DASH_DOT_DOT;
        }
    };

    View.OnClickListener clickwidthValue = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lineWidth = widthValue.getText().toString();
            System.out.print(lineWidth);
        }
    };

//    ColorPickerView touchcolor = new ColorPickerView() {
//        @Override
//        public boolean onTouchEvent(MotionEvent event) {
//            selectedColor = colorpick.getSelectedColor();
//            return true;
//        }
//    };

    View.OnClickListener sss = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            selectedColor = colorpick.getSelectedColor();
            System.out.println(selectedColor);
        }
    };

    public SimpleLineSymbol.Style getLineSymbol() {
        return lineStyle;
    }

    public String getLineWidth() {
        return lineWidth;
    }

    public int getColor() {
        return selectedColor;
    }

}
