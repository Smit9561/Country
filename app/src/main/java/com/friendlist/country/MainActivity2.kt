package com.friendlist.country

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.bumptech.glide.Glide
import com.friendlist.country.databinding.ActivityMain2Binding
import com.friendlist.country.model.CountryModel
import com.friendlist.country.model.Currency
import java.util.Collections.list
import java.util.zip.CheckedInputStream

class MainActivity2 : AppCompatActivity() {

    lateinit var s:List<CountryModel>
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var pos = intent.getIntExtra("pos",0)
        var nam = intent.getStringExtra("name")
        var cap = intent.getStringExtra("capital")
        var reg = intent.getStringExtra("region")
        var are = intent.getDoubleExtra("area", 0.1)
        var time = intent.getStringExtra("timezones")
        var pop = intent.getIntExtra("population", 0)
        Glide.with(applicationContext).load(MainActivity.dataList[pos].flags?.png).into(binding.imageV)
//        Glide.with(applicationContext).load(NameAdapter.)

        binding.txtCap.text = "capital :- " + cap.toString()
        binding.txtName.text="Name :-  "+(nam).toString()
        binding.txtReg.text="Region :- "+(reg).toString()
        binding.txtPop.text ="Population :- "+ pop.toInt().toString()
        binding.txtAre.text = "Area :- "+are.toInt().toString()
        binding.txtTime.text ="Time :- "+time.toString()


    }


}


