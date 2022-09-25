package com.example.cookingrecipeapp.feature.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cookingrecipeapp.R
import com.example.cookingrecipeapp.feature.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        item.setOnClickListener {
            var i = Intent(this, DetailActivity::class.java)
            startActivity(i)
    }
}}