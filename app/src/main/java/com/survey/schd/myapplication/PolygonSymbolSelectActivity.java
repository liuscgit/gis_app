package com.survey.schd.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.esri.arcgisruntime.symbology.SimpleFillSymbol;
import com.esri.arcgisruntime.symbology.SimpleLineSymbol;
import com.esri.arcgisruntime.symbology.SimpleMarkerSymbol;
import com.flask.colorpicker.ColorPickerView;

public class PolygonSymbolSelectActivity extends AppCompatActivity {

    private ImageButton polygonbackwarddiagonalButton;
    private ImageButton polygoncrossButton;
    private ImageButton polygondiagonalcrossButton;
    private ImageButton polygonforwarddiagonalButton;
    private ImageButton polygonhorizontalButton;
    private ImageButton polygonnullButton;
    private ImageButton polygonsolidButton;
    private ImageButton polygonverticalButton;
    private SimpleFillSymbol.Style polygonStyle;
    private EditText outlinewidthValue;
    private String outlineWidth;
    private ColorPickerView colorpick;
    int selectedColor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polysymbol_selector);

        polygonbackwarddiagonalButton = findViewById(R.id.polygon_backward_diagonal);
        polygoncrossButton = findViewById(R.id.polygon_cross);
        polygondiagonalcrossButton = findViewById(R.id.polygon_diagonal_cross);
        polygonforwarddiagonalButton = findViewById(R.id.polygon_forward_diagonal);
        polygonhorizontalButton = findViewById(R.id.polygon_horizontal);
        polygonnullButton = findViewById(R.id.polygon_null);
        polygonsolidButton = findViewById(R.id.polygon_solid);
        polygonverticalButton = findViewById(R.id.polygon_vertical);
        outlinewidthValue = findViewById(R.id.outline_width_input);
        colorpick = findViewById(R.id.polygon_color_picker_view);

        polygonbackwarddiagonalButton.setOnClickListener(clickPolygonbackwarddiagonal);
        polygoncrossButton.setOnClickListener(clickPolygoncross);
        polygondiagonalcrossButton.setOnClickListener(clickPolygondiagonalcross);
        polygonforwarddiagonalButton.setOnClickListener(clickPolygonforwarddiagonal);
        polygonhorizontalButton.setOnClickListener(clickPolygonhorizontal);
        polygonnullButton.setOnClickListener(clickPolygonnull);
        polygonsolidButton.setOnClickListener(clickPolygonsolid);
        polygonverticalButton.setOnClickListener(clickPolygonvertical);

        outlinewidthValue.setOnClickListener(clickwidthValue);

        colorpick.setOnClickListener(sss);

    }

    View.OnClickListener clickPolygonbackwarddiagonal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            v.getId();
            System.out.print(v.getId());
            polygonStyle = SimpleFillSymbol.Style.BACKWARD_DIAGONAL;
        }
    };

    View.OnClickListener clickPolygoncross = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.CROSS;
        }
    };

    View.OnClickListener clickPolygondiagonalcross = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.DIAGONAL_CROSS;
        }
    };

    View.OnClickListener clickPolygonforwarddiagonal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.FORWARD_DIAGONAL;
        }
    };

    View.OnClickListener clickPolygonhorizontal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.HORIZONTAL;
        }
    };

    View.OnClickListener clickPolygonnull = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.NULL;
        }
    };

    View.OnClickListener clickPolygonsolid = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.SOLID;
        }
    };

    View.OnClickListener clickPolygonvertical = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            polygonStyle = SimpleFillSymbol.Style.VERTICAL;
        }
    };

    View.OnClickListener clickwidthValue = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            outlineWidth = outlinewidthValue.getText().toString();
            System.out.print(outlineWidth);
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
        return outlineWidth;
    }

    public int getColor() {
        return selectedColor;
    }

    public SimpleFillSymbol.Style getPolygonSymbol() {
        return polygonStyle;
    }

}
