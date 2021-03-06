package com.interview.themovieDB.view.ui.detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.interview.themovieDB.R
import com.interview.themovieDB.domain.pojo.Actor
import com.interview.themovieDB.view.ui.detail.viewholder.ActorViewHolder

class ActorListAdapter : RecyclerView.Adapter<ActorViewHolder>() {

    private var actors: List<Actor> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.actor_view_layout, parent, false)
        return ActorViewHolder(view)
    }

    override fun getItemCount(): Int = actors.size

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor = actors[position]
        holder.bind(actor)
    }

    fun submitList(listActors: List<Actor>) {
        this.actors = listActors
        notifyDataSetChanged()
    }
}