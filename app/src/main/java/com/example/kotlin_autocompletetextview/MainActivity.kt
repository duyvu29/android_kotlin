package com.example.kotlin_autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // khoii73 tạo và lấy danh sách trong string.xml
        var list =resources.getStringArray(R.array.tinhthanh)
        // khởi tạo adapter
        val adt= ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
        // gọi autocompleteText
        var auto = findViewById<AutoCompleteTextView>(R.id.autoTxt_city)
        auto.setAdapter(adt)
        //
        auto.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus==true){}
            auto.showDropDown()
        }


    }
}