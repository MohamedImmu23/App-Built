package com.example.appbuilt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;

public class ProjectActivity extends AppCompatActivity {

    AppCompatButton checkboxbtn, datepicker, timepicker, radiobox, spinner, togglebutton, switchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        checkboxbtn = findViewById(R.id.checkboxbtn);
        checkboxbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, CheckBoxActivity.class);
                startActivity(next);
            }
        });

        datepicker = findViewById(R.id.datepicker);
        datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, DatePickActivity.class);
                startActivity(next);
            }
        });

        timepicker = findViewById(R.id.timepicker);
        timepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, TimePickActivity.class);
                startActivity(next);
            }
        });

        radiobox = findViewById(R.id.radiobox);
        radiobox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, RadioBoxActivity.class);
                startActivity(next);
            }
        });

        spinner = findViewById(R.id.spinner);
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, SpinnerActivity.class);
                startActivity(next);
            }
        });

        togglebutton = findViewById(R.id.togglebutton);
        togglebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, ToggleActivity.class);
                startActivity(next);
            }
        });

        switchbutton = findViewById(R.id.switchbutton);
        switchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(ProjectActivity.this, SwitchActivity.class);
                startActivity(next);
            }
        });

    }
}