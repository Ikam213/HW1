package com.example.hw1

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val text = view.findViewById<TextView>(R.id.text_view)
    val image = view.findViewById<ImageView>(R.id.image_view)

    fun bind(number: Int){
        text.text="$number"
        if (number%2==1){
            image.setBackgroundColor(Color.argb(255,0,0, 255))
        }
        else {
            image.setBackgroundColor(Color.argb(255, 255, 0, 0))
        }
    }

    fun bindLast(){
        text.text=""
        image.setBackgroundColor(Color.argb(0, 0, 0, 0))
    }
}