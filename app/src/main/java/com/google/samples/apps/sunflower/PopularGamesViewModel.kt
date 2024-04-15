package com.google.samples.apps.sunflower

import android.app.Application
import androidx.annotation.NonNull
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.Retrofit
import com.google.samples.apps.sunflower.Users
import retrofit2.Callback
import retrofit2.Response
import retrofit2.converter.gson.GsonConverterFactory

class PopularGamesViewModel(@NonNull application: Application) : AndroidViewModel(application) {

    var gameList: LiveData<List<Users>>? = null
        private set

    init {


        // Create the retrofit builder
        val builder = Retrofit.Builder()
                .baseUrl(igdbBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())

        // Build retrofit
        val retrofit = builder.build()



    }

    companion object {

        private val igdbBaseUrl = "https://api-endpoint.igdb.com/"
        private val FIELDS = "id,name,genres,cover,popularity"
        private val ORDER = "popularity:desc"
        private val LIMIT = 30
    }
}
