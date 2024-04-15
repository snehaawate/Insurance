package com.google.samples.apps.sunflower.workers

import com.google.gson.annotations.SerializedName
import com.google.samples.apps.sunflower.Users

class UsersProductList (
   // @SerializedName("items")
    @SerializedName("data")
    var users: List<Users>? = null
){

    val size : Int
        get() = users!!.size

    operator fun get(position: Int) = users!![position]
}