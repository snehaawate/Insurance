package com.google.samples.apps.sunflower.viewmodels

import android.util.Log
import androidx.lifecycle.*
import com.google.samples.apps.sunflower.Users
import androidx.annotation.Nullable;
import com.google.samples.apps.sunflower.ProductFragment
import com.google.samples.apps.sunflower.utilities.UserProductAPI
import com.google.samples.apps.sunflower.workers.UsersProductList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Response


class UserProductViewModel : ViewModel() {

    val BASE_URL = "https://api.github.com/search/"
    // Create a LiveData with a String
    val users: MutableLiveData<Users> by lazy {
        MutableLiveData<Users>()

    }

    /*fun getUsers() {
        var retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        var api = retrofit.create(UserProductAPI::class.java)
        var call = api.users
        call.enqueue(object : Callback<UsersProductList> {

            override fun onResponse(call: Call<UsersProductList>?, response: Response<UsersProductList>?) {
                var usres = response?.body()
                var user = usres?.users
                var length = user!!.size

                for (i in 0 until length) {
                    // str = str + "\n" + user.get(i).id + " " + user.get(i).login
                }

                // tv_user!!.text = str
            }

            override   fun onFailure(call: Call<UsersProductList>?, t: Throwable?) {
                Log.v("Error", t.toString())
            }
        })
    }
*/

}

// function to call server and update ui
