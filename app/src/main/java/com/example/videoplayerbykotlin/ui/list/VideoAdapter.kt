package com.example.videoplayerbykotlin.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.DhPlayerView
import com.example.videoplayerbykotlin.R
import com.example.videoplayerbykotlin.Video

class VideoAdapter(private val listVideos: List<Video>) :
    RecyclerView.Adapter<VideoAdapter.ViewHolder>() {
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var videoInList :DhPlayerView = itemView.findViewById(R.id.videoInList)
        var linkOfTheVideo: TextView = itemView.findViewById(R.id.linkOfTheVideo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.video_items, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listVideos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Video = listVideos.get(position)
        holder.linkOfTheVideo.text=item.url

    }
}