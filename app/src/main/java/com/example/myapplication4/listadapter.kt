package com.example.myapplication4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class listadapter(private val itemList: List<String>, private val context: Context) : BaseAdapter() {

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val itemTextView = view!!.findViewById<TextView>(R.id.itemTextView)
        val thumb = view!!.findViewById<ImageView>(R.id.thumb)
        val url = "https://telugunewsadda.com/wp-content/uploads/2023/01/wp-1674098218941.jpg"
//        Glide.with(context).load("https://telugunewsadda.com/wp-content/uploads/2023/01/wp-1674098218941.jpg").into(thumb)
        Picasso.get().load(url).into(thumb)

        val item = itemList[position]
        itemTextView.text = item
        itemTextView.setOnClickListener {
            Toast.makeText(context, "You clicked", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}