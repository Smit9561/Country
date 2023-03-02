package com.friendlist.country

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.friendlist.country.ApiClient.Companion.BASE_URL
import com.friendlist.country.model.CountryModel


class NameAdapter(var mList: List<CountryModel>) :
    RecyclerView.Adapter<NameAdapter.ViewHolder>() {

        var dataList = mList
    lateinit var context: Context


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        context = parent.context
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.countrylist, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        with(dataList[position]) {

            val ItemsViewModel = mList[position]

            Glide.with(context).load(ItemsViewModel.flags?.png).into(holder.imageView)
            holder.textView.text = ItemsViewModel.name

            holder.itemView.setOnClickListener {

                var intent = Intent(context, MainActivity2::class.java)
                intent.putExtra("region", region)
                intent.putExtra("name", name)
                intent.putExtra("capital", capital)
                intent.putExtra("area", area)
                intent.putExtra("timezones", timezones.toString())
                intent.putExtra("population", population)
                intent.putExtra("currencies", listOf(currencies).toString())
                intent.putExtra("pos",position)

                context.startActivity(intent)
            }

        }
    }

    override fun getItemCount(): Int {

        return mList.size
    }
}


