package com.example.appbuilt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    SwitchCompat simpleswitchbtn;
    String ifchecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        //find the switch button
        simpleswitchbtn = findViewById(R.id.simpleswitchbtn);


        //when it gets clicked
        simpleswitchbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    ifchecked = "1";
                    Toast.makeText(SwitchActivity.this, ifchecked, Toast.LENGTH_SHORT).show();
                } else {
                    ifchecked = "0";
                    Toast.makeText(SwitchActivity.this, ifchecked, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}