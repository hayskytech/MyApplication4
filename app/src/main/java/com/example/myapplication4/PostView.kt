package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class PostView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_view)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Back to Home"
        val post_title = findViewById<TextView>(R.id.post_title)
        val post_content = findViewById<TextView>(R.id.post_content)
        val post_thumb = findViewById<ImageView>(R.id.post_thumb)
        post_title.text = Html.fromHtml(intent.getStringExtra("title"),Html.FROM_HTML_MODE_LEGACY)
        post_content.text = Html.fromHtml( intent.getStringExtra("content"),Html.FROM_HTML_MODE_LEGACY)

        val img = intent.getStringExtra("thumb")
        Picasso.get().load(img).into(post_thumb)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}