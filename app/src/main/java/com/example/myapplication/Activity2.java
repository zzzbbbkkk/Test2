package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 创建主布局
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setBackgroundColor(Color.WHITE);

        // 创建标题
        TextView title = new TextView(this);
        title.setText("Hello TableLayout");
        title.setTextSize(24);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 50, 0, 50);

        // 创建表格布局
        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT
        ));
        tableLayout.setPadding(20, 0, 20, 0);
        tableLayout.setStretchAllColumns(true);

        // 添加标题到主布局
        mainLayout.addView(title);

        // 添加分隔线
        View separator = new View(this);
        separator.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                2
        ));
        separator.setBackgroundColor(Color.LTGRAY);
        mainLayout.addView(separator);

        // 添加表格到主布局
        mainLayout.addView(tableLayout);

        // 添加表格行
        addTableRow(tableLayout, "Open...", "Ctrl-O", true);
        addTableRow(tableLayout, "Save...", "Ctrl-S", true);
        addTableRow(tableLayout, "Save As...", "Ctrl-Shift-S", true);

        // 添加分隔行
        addSeparatorRow(tableLayout);

        addTableRow(tableLayout, "Import...", "", false);
        addTableRow(tableLayout, "Export...", "Ctrl-E", false);

        // 添加分隔行
        addSeparatorRow(tableLayout);

        // 添加退出按钮行
        addQuitRow(tableLayout);

        setContentView(mainLayout);
    }

    private void addTableRow(TableLayout table, String leftText, String rightText, boolean enabled) {
        TableRow row = new TableRow(this);
        row.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        // 左侧文本
        TextView leftTextView = new TextView(this);
        leftTextView.setText(leftText);
        leftTextView.setTextSize(18);
        leftTextView.setPadding(20, 30, 20, 30);
        if (!enabled) {
            leftTextView.setTextColor(Color.GRAY);
        }

        // 右侧文本
        TextView rightTextView = new TextView(this);
        rightTextView.setText(rightText);
        rightTextView.setTextSize(16);
        rightTextView.setPadding(20, 30, 20, 30);
        rightTextView.setGravity(Gravity.RIGHT);
        if (!enabled) {
            rightTextView.setTextColor(Color.GRAY);
        }

        // 添加视图到行
        row.addView(leftTextView);
        row.addView(rightTextView);

        // 如果可用，添加点击效果
        if (enabled) {
            row.setBackgroundResource(android.R.drawable.list_selector_background);
            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Activity2.this, leftText + " clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }

        table.addView(row);
    }

    private void addSeparatorRow(TableLayout table) {
        TableRow row = new TableRow(this);
        row.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        View separator = new View(this);
        separator.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                1
        ));
        separator.setBackgroundColor(Color.LTGRAY);

        row.addView(separator);
        table.addView(row);
    }

    private void addQuitRow(TableLayout table) {
        TableRow row = new TableRow(this);
        row.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
        ));

        TextView quitTextView = new TextView(this);
        quitTextView.setText("Quit");
        quitTextView.setTextSize(18);
        quitTextView.setPadding(20, 30, 20, 30);
        quitTextView.setGravity(Gravity.CENTER);

        row.addView(quitTextView);

        // 添加点击效果
        row.setBackgroundResource(android.R.drawable.list_selector_background);
        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        table.addView(row);
    }
}