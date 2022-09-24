package com.example.cookingrecipeapp.feature.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cookingrecipeapp.R
import com.example.cookingrecipeapp.feature.home.HomeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_cookingTime.setOnClickListener {
            var i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
    }
}