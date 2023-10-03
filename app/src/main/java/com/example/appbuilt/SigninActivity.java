package com.example.appbuilt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {

    Button signinbtn;
    EditText name, password, mail;
//    String name = "aransys";
//    String password = "aransys";
//    String mail = "aransys@gmail.com" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        name = findViewById(R.id. name);
        password = findViewById(R.id.password);
        mail = findViewById(R.id.mail);

        signinbtn = findViewById(R.id.signinbtn);
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("aransys") &&
                        password.getText().toString().equals("aransys") &&
                        mail.getText().toString().equals("aransys@gmail.com")) {

                    //correcct password

                    SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();

                    editor.putBoolean("flag", true);
                    editor.apply();

                    Intent iHome = new Intent(SigninActivity.this, HomeActivity.class);
                    startActivity(iHome);

                } else {
                    //wrong password
                    Toast.makeText(SigninActivity.this, "Wrong Details", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
