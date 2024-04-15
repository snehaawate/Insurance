package com.google.samples.apps.sunflower.utilities
import com.google.samples.apps.sunflower.Users
import com.google.samples.apps.sunflower.SingleProductDetails
import com.squareup.moshi.Json
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SingleProductDetailsAPI {
    /*val productCodeString: String*/
    //@get:GET("api/?func=product_one&api_key=J5bI7RkAmE7qOMAwqvFZ2.WxwaBWODgix0uy6ry2VLatls3zV.3I2&product_code=P1700003")
    @GET("api/?func=product_one")
    //fun setProductCode(@Query("api_key") apiKey: String, @Query("product_code") productCode: String): Call<SingleProductDetails>
    fun setProductCode(@Query("api_key") apiKey: String, @Query("product_code") productCode: String): Call<ResponseBody>
    //val productFields: Call<SingleProductDetails>

}