package com.example.appbuilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioBoxActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;
    RadioButton radioButton;
    TextView textView;
    Button button3;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_box);

        radioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        textView = findViewById(R.id.textView);
        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);
                textView.setText(" Your Choice : " + radioButton.getText());

            }
        });

    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        //Toasty.error(yourContext, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
        //Toast.makeText(this, "Selected Radio Button : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}