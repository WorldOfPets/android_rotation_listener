package com.example.myapplication.ui

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

// This is class for usefully function
class Helper {
    companion object {
        fun alert(context: Context,  message:String, title:String = "Error",){
            AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Write to log file") { _, _ ->
                    Toast.makeText(context, "Error write to log!", Toast.LENGTH_LONG).show()
                }.show()
        }
    }
}