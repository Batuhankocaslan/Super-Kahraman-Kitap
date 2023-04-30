package com.batuhan.superkahramankitap

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Aquaman")

        //Verimsiz Tanımlamalar
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquamen)
        var superKahramanGorselleri=ArrayList<Bitmap>()
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        val adapter=RecyclerAdapter(superKahramanIsimleri,superKahramanGorselleri)
        recyclerView.adapter=adapter
    }
}