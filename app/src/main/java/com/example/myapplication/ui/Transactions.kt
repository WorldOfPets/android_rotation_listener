package com.example.myapplication.ui

import kotlinx.serialization.Serializable

@Serializable
data class Transactions(
    var id:Int,
    var name_operation:String,
    var created_at:String,
    var date:String,
    var money:Float

)
