package com.example.newmenu4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MenuAdapter(val menuList: Array<menu>) : RecyclerView.Adapter<MenuAdapter.CustomViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuAdapter.CustomViewHolder, position: Int) {
        holder.food.setImageResource(menuList.get(position).food)
        holder.name.text=menuList.get(position).name
        holder.price.text=menuList.get(position).price.toString()
        holder.explain.text=menuList.get(position).explain

    }

    override fun getItemCount(): Int {
        return menuList.size
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val food =itemView.findViewById<ImageView>(R.id.iv_menu)//음식사진
        val name =itemView.findViewById<TextView>(R.id.tv_name)//음식이름
        val price =itemView.findViewById<TextView>(R.id.tv_price)//음식가격
        val explain =itemView.findViewById<TextView>(R.id.tv_explain)//음식설명

    }


}