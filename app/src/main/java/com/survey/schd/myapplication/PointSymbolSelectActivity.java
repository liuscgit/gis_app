package com.survey.schd.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.esri.arcgisruntime.symbology.SimpleLineSymbol;
import com.esri.arcgisruntime.symbology.SimpleMarkerSymbol;
import com.flask.colorpicker.ColorPickerView;

public class PointSymbolSelectActivity extends AppCompatActivity {

    private ImageButton pointcircleButton;
    private ImageButton pointcrossButton;
    private ImageButton pointdiamondButton;
    private ImageButton pointsquareButton;
    private ImageButton pointtriangleButton;
    private ImageButton pointxButton;
    private EditText sizeValue;
    private String pointSize;
    private SimpleMarkerSymbol.Style pointStyle;
    private ColorPickerView colorpick;
    int selectedColor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointsymbol_selector);

        pointcircleButton = findViewById(R.id.point_circle);
        pointcrossButton = findViewById(R.id.point_cross);
        pointdiamondButton = findViewById(R.id.point_diamond);
        pointsquareButton = findViewById(R.id.point_square);
        pointtriangleButton = findViewById(R.id.point_triangle);
        pointxButton = findViewById(R.id.point_x);
        sizeValue = findViewById(R.id.size_input);
        colorpick = findViewById(R.id.point_color_picker_view);

        pointcircleButton.setOnClickListener(clickPointcircle);
        pointcrossButton.setOnClickListener(clickPointcross);
        pointdiamondButton.setOnClickListener(clickPointdiamond);
        pointsquareButton.setOnClickListener(clickPointsquare);
        pointtriangleButton.setOnClickListener(clickPointtriangle);
        pointxButton.setOnClickListener(clickPointx);
        sizeValue.setOnClickListener(clickwidthValue);

        colorpick.setOnClickListener(sss);
    }

    View.OnClickListener clickPointcircle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointStyle = SimpleMarkerSymbol.Style.CIRCLE;
        }
    };

    View.OnClickListener clickPointcross = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointStyle = SimpleMarkerSymbol.Style.CROSS;
        }
    };

    View.OnClickListener clickPointdiamond = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointStyle = SimpleMarkerSymbol.Style.DIAMOND;
        }
    };

    View.OnClickListener clickPointsquare = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointStyle = SimpleMarkerSymbol.Style.SQUARE;
        }
    };

    View.OnClickListener clickPointtriangle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointStyle = SimpleMarkerSymbol.Style.TRIANGLE;
        }
    };

    View.OnClickListener clickPointx = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointStyle = SimpleMarkerSymbol.Style.X;
        }
    };

    View.OnClickListener clickwidthValue = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pointSize = sizeValue.getText().toString();
            System.out.print(pointSize);
        }
    };

    View.OnClickListener sss = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            selectedColor = colorpick.getSelectedColor();
            System.out.println(selectedColor);
        }
    };

    public String getLineWidth() {
        return pointSize;
    }

    public SimpleMarkerSymbol.Style getPointSymbol() {
        return pointStyle;
    }

    public int getColor() {
        return selectedColor;
    }

}
