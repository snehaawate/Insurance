package com.google.samples.apps.sunflower

import com.google.samples.apps.sunflower.Users
import com.google.samples.apps.sunflower.utilities.UserProductAPI
import com.google.samples.apps.sunflower.viewmodels.UserProductViewModel
import com.google.samples.apps.sunflower.workers.UsersProductList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Response
import com.google.samples.apps.sunflower.ProductField
import com.google.gson.annotations.SerializedName
import java.lang.reflect.Array.get

class SingleProductDetails (
        @SerializedName("data")
       // var productField: List<ProductField>? = null
        var productField: ProductField? = null
)//{

 //   var listOfProductField: ArrayList<ProductField> = ArrayList()


//}
{

    /* val size : Int
     get() = productField!!.size

     operator fun get(position: Int) =productField!![position]*/
}