package com.example.myapplication4

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.myapplication4.R
import okhttp3.*
import org.json.JSONArray
import org.json.JSONException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.newRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.visibility = View.VISIBLE
        val queue = Volley.newRequestQueue(this)
        val url = "https://telugunewsadda.com/wp-json/wp/v2/posts?per_page=10"

        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.GET, url,
            null,
            Response.Listener { response ->
                // Handle the response
                try {
                    val listItems = mutableListOf<Post>()
                    // Iterate through the JSON array
                    for (i in 0 until response.length()) {
                        val jsonObject = response.getJSONObject(i)
                        val id = jsonObject.getInt("id")
                        val title = jsonObject.getJSONObject("title").getString("rendered")
                        val content = jsonObject.getJSONObject("content").getString("rendered")
                        val thumb = jsonObject.getString("featured_media_src_url")
                        listItems.add(Post(id, title,thumb,content))
                    }
                    val postRecyclerView = findViewById<RecyclerView>(R.id.newRecyclerView)
                    val postAdapter = PostListAdapter(listItems)
                    postRecyclerView.adapter = postAdapter
//                    Toast.makeText(this, "You clicked", Toast.LENGTH_LONG).show()
                    progressBar.visibility = View.GONE

                } catch (e: JSONException) {
                    e.printStackTrace()
                    Toast.makeText(this, "No clicked", Toast.LENGTH_LONG).show()
                }
            },
            Response.ErrorListener { error ->
                // Handle the error
                error.printStackTrace()
            }
        )

        queue.add(jsonArrayRequest)
    }

}
