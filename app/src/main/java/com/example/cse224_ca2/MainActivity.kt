package com.example.cse224_ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str ="Selected:"
        val rb1:RadioButton=findViewById(R.id.radioBT1)
        val rb2:RadioButton=findViewById(R.id.radioBT2)
        val cb1:CheckBox=findViewById(R.id.checkBox1)
        val cb2:CheckBox=findViewById(R.id.checkBox2)

        rb1.setOnClickListener {
            str+=rb1.text.toString()
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
            str="Selected: "
        }
        rb2.setOnClickListener {
            str+=rb2.text.toString()
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
            str="Selected: "
        }

        cb1.setOnClickListener {
            if(cb1.isChecked)
            {
                str+=cb1.text.toString()
                Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
                str="Selected: "
            }
        }
        cb2.setOnClickListener {
            if(cb2.isChecked)
            {
                str+=cb2.text.toString()
                Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
                str="Selected: "
            }

        }
    }
}