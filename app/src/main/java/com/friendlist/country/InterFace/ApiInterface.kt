package com.friendlist.countrydata.InterFace

import com.friendlist.country.model.CountryModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {


        @GET("v2/all")
        fun getPosts(): Call<List<CountryModel>>

}