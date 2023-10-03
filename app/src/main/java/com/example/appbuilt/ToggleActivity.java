package com.example.appbuilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    ToggleButton togglebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        //find the toggle btn
        togglebtn = findViewById(R.id.togglebtn);

        //when it gets clicked
        togglebtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(ToggleActivity.this, "Toggle is Enabled", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ToggleActivity.this, "Toggle is Disabled", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}