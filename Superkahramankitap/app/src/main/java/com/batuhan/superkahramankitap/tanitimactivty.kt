package com.batuhan.superkahramankitap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class tanitimactivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitimactivty)
        val textView = findViewById<TextView>(R.id.textView)

        val intent=intent
        val secilenKahramanIsmi= intent.getStringExtra("superKahramanIsmi")
        textView.text=secilenKahramanIsmi
        val imageView = findViewById<ImageView>(R.id.imageView)

        val secilenKahraman=SingletonClass.SecilenKahraman
        val secilenGorsel=secilenKahraman.gorsel
        imageView.setImageBitmap(secilenGorsel)
     }
}