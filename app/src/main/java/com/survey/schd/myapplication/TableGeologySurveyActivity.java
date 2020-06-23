package com.survey.schd.myapplication;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.bin.david.form.core.SmartTable;
import com.bin.david.form.data.CellInfo;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.format.IFormat;
import com.bin.david.form.data.format.grid.BaseGridFormat;
import com.bin.david.form.data.format.selected.BaseSelectFormat;
import com.bin.david.form.data.style.FontStyle;
import com.bin.david.form.data.style.LineStyle;
import com.bin.david.form.data.table.FormTableData;
import com.bin.david.form.data.table.TableData;
import com.bin.david.form.utils.DensityUtils;



public class TableGeologySurveyActivity extends AppCompatActivity {

    private SmartTable<Form> table;
    private View llBottom;
    private Button searchBtn;
    private EditText editText;
    private Form selectForm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_geologysurvey);

        table = (SmartTable<Form>) findViewById(R.id.table);
        int dp5 = DensityUtils.dp2px(this,10);
        table.getConfig().setVerticalPadding(dp5)
                .setTextLeftOffset(dp5);
        table.getConfig().setContentGridStyle(new LineStyle(-1, ContextCompat.getColor(this,android.R.color.darker_gray)));
//        llBottom = findViewById(R.id.ll_bottom);
//        searchBtn = (Button) findViewById(R.id.tv_query);
//        searchBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(selectForm !=null){
//                    selectForm.setName(editText.getText().toString());
//                    table.invalidate();
//                    editText.setText("");
//                }
//            }
//        });
//        editText = (EditText)findViewById(R.id.edit_query) ;
        Form[][] forms = {
//                {
//                        new Form("姓名", Paint.Align.LEFT), Form.Empty,
//                        new Form("性别", Paint.Align.LEFT), Form.Empty,
//                        new Form("出生日期", Paint.Align.LEFT),Form.Empty,
//                        new Form("民族", Paint.Align.LEFT), Form.Empty,
//                        new Form("婚否", Paint.Align.LEFT), Form.Empty,
//                        new Form(1, 4, "照片")
//                },
                {
                        new Form(1, 1, "起讫桩号", Paint.Align.LEFT), new Form(4, 1, "")
                        , new Form(1, 1, "岩土名称", Paint.Align.LEFT), new Form(4, 1, "")
                },
                {
                        new Form(1, 1, "岩土类别", Paint.Align.LEFT), new Form(4, 1, "")
                        , new Form(1, 1, "岩层产状", Paint.Align.LEFT), new Form(4, 1, "")
                },
                {
                        new Form(1, 1, "风化情况", Paint.Align.LEFT), new Form(4, 1, "")
                        , new Form(1, 1, "密度", Paint.Align.LEFT), new Form(4, 1, "")
                },
                {
                        new Form(1, 1, "湿度", Paint.Align.LEFT), new Form(4, 1, "")
                        , new Form(1, 1, "地形横坡", Paint.Align.LEFT), new Form(4, 1, "")
                },
                {
                        new Form(1, 1, "土石成分", Paint.Align.LEFT), new Form(9, 1, "")
                },
                {
                        new Form(1, 1, "探孔布置", Paint.Align.LEFT), new Form(9, 1, "")
                },
                {
                        new Form(1, 1, "试验取样", Paint.Align.LEFT), new Form(9, 1, "")
                },
                {
                        new Form( 1, 5, "工程地质描述", Paint.Align.LEFT), new Form(9, 1, "")
                },
                {
                        new Form(10, 1, "")
                },
                {
                        new Form(10, 1, "")
                },
                {
                        new Form(10, 1, "")
                },
                {
                        new Form(10, 1, "")
                },
                {
                        new Form(1, 2, "水文地质描述", Paint.Align.LEFT), new Form(9 ,1, "")
                },
                {
                        new Form(10, 1, "")
                },

                {
                        new Form( "备注附图见后页", Paint.Align.LEFT), new Form(9 ,1, "")
                },
                {
                        new Form(10, 1, "")
                },
                {
                        new Form(1, 1, "记录"), new Form(4, 1, "")
                        , new Form(1, 1, "复核"), new Form(4, 1, "")
                }

        };

        final FormTableData<Form> tableData = FormTableData.create(table, "一般路段地质调查记录表", 10, forms);
        tableData.setFormat(new IFormat<Form>() {
            @Override
            public String format(Form form) {
                if (form != null) {
                    return form.getName();
                } else {
                    return "";
                }
            }
        });
        table.setSelectFormat(new BaseSelectFormat());
        tableData.setOnItemClickListener(new TableData.OnItemClickListener<Form>() {
            @Override
            public void onClick(Column column, String value, Form form, int col, int row) {
                if(form !=null){
                    selectForm = form;
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
                }

            }

        });
        table.getConfig().setTableGridFormat(new BaseGridFormat(){
            @Override
            protected boolean isShowHorizontalLine(int col, int row, CellInfo cellInfo) {
                if(row == tableData.getLineSize() -1){
                    return false;
                }
                return true;
            }

            @Override
            protected boolean isShowVerticalLine(int col, int row, CellInfo cellInfo) {
                if(row == tableData.getLineSize() -1){
                    return false;
                }
                return true;
            }
        });
        table.setTableData(tableData);
//        Column<String> input1 = new Column<>("", "input1");
//        Column<String> input2 = new Column<>("", "input2");
//        Column<String> input3 = new Column<>("", "input3");
//        Column<String> input4 = new Column<>("", "input4");
//        input1.setAutoMerge(true);
//        List<UserInfo> list = new ArrayList<>();
//        list.add(new UserInfo("起讫桩号", "","岩土名称", ""));
//        list.add(new UserInfo("岩土类别", "","岩层产状", ""));
//        list.add(new UserInfo("风化情况", "","密度", ""));
//        list.add(new UserInfo("湿度","","地形横坡", ""));
//        list.add(new UserInfo("土石成分","","", ""));
//        list.add(new UserInfo("探孔布置", "", "", ""));
//        list.add(new UserInfo("试验取样", "","", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("工程地质描述","", "", ""));
//        list.add(new UserInfo("水文地质描述","", "", ""));
//        list.add(new UserInfo("水文地质描述","", "", ""));
//        list.add(new UserInfo("水文地质描述","", "", ""));
//        list.add(new UserInfo("水文地质描述","", "", ""));
//        list.add(new UserInfo("水文地质描述","", "", ""));
//        list.add(new UserInfo("水文地质描述","", "", ""));
//        list.add(new UserInfo("备注附图见后页", "","", ""));
//
//        TableData<UserInfo> tableData = new TableData<>("一般路段地质调查记录表", list, input1, input2, input3, input4);
//
//        table = findViewById(R.id.table);
//        table.setTableData(tableData);
//        table.getConfig().setContentStyle(new FontStyle(40, Color.DKGRAY));
//        table.getConfig().setShowXSequence(false);
//        table.getConfig().setVerticalPadding(30);
//        table.getConfig().setTableTitleStyle(new FontStyle(50, Color.DKGRAY));
    }
}
