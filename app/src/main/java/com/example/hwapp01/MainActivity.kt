package com.example.hwapp01

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result=findViewById<TextView>(R.id.textView8)


        var ice=findViewById<RadioGroup>(R.id.radioGroup)
        var sweet=findViewById<RadioGroup>(R.id.radioGroup2)
        var btn=findViewById<Button>(R.id.button2)


        btn.setOnClickListener{
            result.text="冰塊:"+ice.findViewById<RadioButton>(ice.checkedRadioButtonId).text.toString()+" "+"甜度:"+sweet.findViewById<RadioButton>(sweet.checkedRadioButtonId).text.toString()




        }
    }
}