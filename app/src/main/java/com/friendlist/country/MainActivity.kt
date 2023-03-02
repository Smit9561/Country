package com.friendlist.country

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.friendlist.country.databinding.ActivityMainBinding
import com.friendlist.country.model.CountryModel
import com.friendlist.countrydata.InterFace.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {


    private val TAG = "MainActivity"


    companion object {

        lateinit var dataList: List<CountryModel>


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        var apiInterface = ApiClient.getRetrofit().create(ApiInterface::class.java)

        apiInterface.getPosts().enqueue(object : Callback<List<CountryModel>> {
            override fun onResponse(
                call: Call<List<CountryModel>>,
                response: Response<List<CountryModel>>
            ) {


                dataList = response.body()!!

                binding.RecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                binding.RecyclerView.adapter = NameAdapter(dataList)


//             if (response.isSuccessful){
//
//                 var dataList = response.body()
//                 for (data in dataList!!){
//
//                     Log.e(TAG, "name  : "+data.name )
//                     Log.e(TAG, "capital : "+data.capital)
//                     Log.e(TAG, "=============================" )
//
//                 }
//
//
//             }


            }

            override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {

                Toast.makeText(this@MainActivity, "Failed : " + t.message, Toast.LENGTH_SHORT)
                    .show()
                Log.e(TAG, "onFailure: " + t.message)

            }

        })


    }
}
