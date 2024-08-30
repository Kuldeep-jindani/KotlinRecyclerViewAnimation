package com.kuldeep.kotlinrecyclerviewanimation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    var list: ArrayList<RecyclerModel>,
    var context: Context
) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var desc = itemView.findViewById<TextView>(R.id.item_desc)
        var item_img = itemView.findViewById<ImageView>(R.id.item_img)
        var card_view = itemView.findViewById<CardView>(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.desc.text = list[position].title
        holder.item_img.setImageResource(list[position].imgRes)
        holder.card_view.startAnimation(AnimationUtils.loadAnimation(context,R.anim.anim_four))
    }
}