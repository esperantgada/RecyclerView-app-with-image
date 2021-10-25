package com.example.affirmationswithimages.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationswithimages.R
import com.example.affirmationswithimages.model.Affirmation

class ItemAdapter(val context: Context, private val affirmationList : List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){


    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.affirmationImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val affirmation = affirmationList[position]
        holder.textView.text = context.resources.getString(affirmation.stringResourceId)
        holder.imageView.setImageResource(affirmation.imageResourceId)
    }

    override fun getItemCount(): Int {
        return affirmationList.size
    }
}