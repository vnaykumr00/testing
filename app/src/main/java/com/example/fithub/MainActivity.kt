package com.example.fithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val imageView:ImageView=findViewById(R.id.imageView)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener {
            val fragmentManager=supportFragmentManager
            val fragment:Fragment=Nutrition()
            val fragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.linearLayout,fragment)
            fragmentTransaction.commit()
        }
    }
}