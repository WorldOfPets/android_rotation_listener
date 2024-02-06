package com.example.myapplication.ui

import android.content.pm.ApplicationInfo
import android.os.Build
import android.os.Bundle
import android.view.OrientationEventListener
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.lang.Exception
import java.util.Locale.Category


class MainActivity : AppCompatActivity() {
    var stars: Int = 0
    lateinit var tV: TextView
    lateinit var progressB: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tV = findViewById(R.id.testTextView)
        progressB = findViewById(R.id.progressBarTest)
        try {
            throw Exception("Im test exception!")
        }catch (e:Exception){
            Helper.alert(this, e.message.toString())

//            AlertDialog.Builder(this)
//                .setTitle("Hello world")
//                .setMessage(e.message.toString())
//                .setPositiveButton("Yes") { _, _ ->
//                    Toast.makeText(this, "Yess!", Toast.LENGTH_LONG).show()
//                }
//                .setNegativeButton("No"){_, _ ->
//                    Toast.makeText(this, "Nooo!", Toast.LENGTH_LONG).show()
//                }.show()
        }


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