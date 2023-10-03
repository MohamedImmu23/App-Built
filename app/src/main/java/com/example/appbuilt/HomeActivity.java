package com.example.appbuilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton back_imgbtn;

    Button project_expand;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        back_imgbtn = findViewById(R.id. back_imgbtn);
        back_imgbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                editor.putBoolean("flag", false);
                editor.apply();

                Intent back = new Intent(HomeActivity.this, SigninActivity.class);
                startActivity(back);

            }
        });

        project_expand = findViewById(R.id.project_expand);
        project_expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forward = new Intent(HomeActivity.this, ProjectActivity.class);
                startActivity(forward);
            }
        });

    }
}