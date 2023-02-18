package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class PostView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_view)

        val post_title = findViewById<TextView>(R.id.post_title)
        val post_thumb = findViewById<ImageView>(R.id.post_thumb)
        post_title.text = intent.getStringExtra("title")
        val img = intent.getStringExtra("thumb")

        Picasso.get().load(img).into(post_thumb)

    }
}