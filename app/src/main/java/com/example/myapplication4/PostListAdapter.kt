package com.example.myapplication4

// PostListAdapter.kt

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.coroutines.NonDisposableHandle.parent

class PostListAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostListAdapter.PostViewHolder>() {

    inner class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.itemTextView)

        val thumb: ImageView = view.findViewById(R.id.thumb)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.titleTextView.text = post.title
        Picasso.get().load(post.thumb).into(holder.thumb)
        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, PostView::class.java)
            intent.putExtra("thumb",post.thumb)
            intent.putExtra("title",post.title)
            intent.putExtra("content",post.content)
            holder.itemView.context.startActivity(intent)
        }

//        holder.contentTextView.text = post.content
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}