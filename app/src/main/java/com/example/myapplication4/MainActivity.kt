package com.example.myapplication4

import android.Manifest
import android.content.ContentValues.TAG
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
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
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Internet available", Toast.LENGTH_LONG).show()
            tech()
        } else {
            Toast.makeText(this, "Internet not available", Toast.LENGTH_LONG).show()
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.INTERNET), 1)
        }

    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            1 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    recreate()
                } else {
                    Toast.makeText(this, "Permission not granted", Toast.LENGTH_LONG).show()
                }
                return
            }
        }
    }


    fun tech(){
        val queue = Volley.newRequestQueue(this)
        val url = "https://telugunewsadda.com/wp-json/wp/v2/posts?_fields=id,title,content,jetpack_featured_media_url&per_page=20"
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
                        val thumb = jsonObject.getString("jetpack_featured_media_url")
                        listItems.add(Post(id, title,thumb,content))
                    }
                    val postRecyclerView = findViewById<RecyclerView>(R.id.newRecyclerView)
                    val postAdapter = PostListAdapter(listItems)
                    postRecyclerView.adapter = postAdapter
//                    Toast.makeText(this, "You clicked", Toast.LENGTH_LONG).show()
                    val progressBar1 = findViewById<ProgressBar>(R.id.progressBar)
                    progressBar1.visibility = View.GONE

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
