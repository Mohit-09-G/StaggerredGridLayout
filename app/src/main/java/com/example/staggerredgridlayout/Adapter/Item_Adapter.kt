package com.example.staggerredgridlayout.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.staggerredgridlayout.R

class Item_Adapter (private val itemList:List<Int>) :
    RecyclerView.Adapter<Item_Adapter.ItemViewHolder>(){


    class ItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView = itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
holder.imageView.setImageResource(itemList[position])
   }
}