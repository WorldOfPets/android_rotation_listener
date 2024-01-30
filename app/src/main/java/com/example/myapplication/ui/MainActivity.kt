package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.OrientationEventListener
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    var stars: Int = 0
    lateinit var tV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tV = findViewById(R.id.testTextView)
        val orientationEventListener = object : OrientationEventListener(applicationContext) {
            override fun onOrientationChanged(orientation: Int) {
                when (orientation) {
                    in 49..51 -> {
                        addStars()
                        Toast.makeText(this@MainActivity, orientation.toString(), Toast.LENGTH_LONG).show()
                    }
                    in 309..311 -> {
                        removeStars()
                        Toast.makeText(this@MainActivity, orientation.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        orientationEventListener.enable()
    }
    fun addStars(){
        if (stars < 5){
            stars += 1
            tV.text = "Stars: $stars"
        }
    }
    fun removeStars(){
        if (stars > 0){
            stars -= 1
            tV.text = "Stars: $stars"
        }
    }
}