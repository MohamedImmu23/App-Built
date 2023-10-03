package com.example.appbuilt

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckBoxActivity : AppCompatActivity() {
    private var ch: CheckBox? = null
    private var ch1: CheckBox? = null
    private var ch2: CheckBox? = null
    private var ch3: CheckBox? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        ch = findViewById<View>(R.id.checkBox) as CheckBox
        ch1 = findViewById<View>(R.id.checkBox1) as CheckBox
        ch2 = findViewById<View>(R.id.checkBox2) as CheckBox
        ch3 = findViewById<View>(R.id.checkBox3) as CheckBox
    }

    fun Check(v: View?) {
        var msg = ""
        if (ch!!.isChecked) msg = "$msg HTML "
        if (ch1!!.isChecked) msg = "$msg JavaScript "
        if (ch2!!.isChecked) msg = "$msg PHP "
        if (ch3!!.isChecked) msg = "$msg Java "

        // Toast is created to display the
        // message using show() method.
        Toast.makeText(this, msg + "are selected", Toast.LENGTH_LONG).show()
    }
}