package com

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.batuhan.superkahramankitap.R
import com.batuhan.superkahramankitap.SingletonClass
import com.batuhan.superkahramankitap.tanitimactivty


class RecyclerAdapter(val kahramanListesi:ArrayList<String>, val kahramanGorselleri:ArrayList<Bitmap>):RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView:View):RecyclerView.ViewHolder(itemView) {
        val recyclerViewTextView: TextView = itemView.findViewById(R.id.recyclerViewTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
            //Inflater,LayoutInflater,MenuInflater
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemView)
    }



    override fun getItemCount(): Int {
     return kahramanListesi.size
    }
    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.recyclerViewTextView.text = kahramanListesi[position]
        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,tanitimactivty::class.java)
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
            val singleton=SingletonClass.SecilenKahraman
            singleton.gorsel = kahramanGorselleri.get(position)
        holder.itemView.context.startActivity(intent)
        }

    }
}


