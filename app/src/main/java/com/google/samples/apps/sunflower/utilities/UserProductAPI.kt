package com.google.samples.apps.sunflower.utilities
import com.google.samples.apps.sunflower.SingleProductDetails
import com.google.samples.apps.sunflower.Users
import com.google.samples.apps.sunflower.workers.UsersProductList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


const val apiString = "goof"

interface UserProductAPI {
    //urls
   // @get:GET("users?q=rohitkan")
    //@get:GET("api/?func=product_all&api_key=J5bI7RkAmE7qOMAwqvFZ2.WxwaBWODgix0uy6ry2VLatls3zV.3I2")
    @GET("api/?func=product_all")
    fun setProductAPI(@Query("api_key") productCode: String): Call<UsersProductList>
   // val users: Call<UsersProductList>
}