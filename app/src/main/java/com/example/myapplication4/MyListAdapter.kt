package com.example.myapplication4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class MyListAdapter(context: Context, private val items: List<Pair<String, String>>) :
    ArrayAdapter<Pair<String, String>>(context, R.layout.list_item, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val item = items[position]

        val textView = view?.findViewById<TextView>(R.id.itemTextView)
        textView?.text = item.first

        val imageView = view?.findViewById<ImageView>(R.id.thumb)
        Picasso.get().load(item.second).into(imageView)

        return view!!
    }
}
