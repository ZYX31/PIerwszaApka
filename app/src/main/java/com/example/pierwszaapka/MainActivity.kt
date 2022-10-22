package com.example.pierwszaapka

import android.annotation.SuppressLint
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonF = findViewById<Button>(R.id.ButtonF)
        val buttonS = findViewById<Button>(R.id.ButtonS)
        buttonF.setOnClickListener{

            buttonF.text = "Działa!"
            val message = Toast.makeText(applicationContext,"Raz Mi daje raz zabiera!",Toast.LENGTH_LONG)
            message.show()

            //Tworzymy nowa aktywnosc odpalajaca SecondActivity
            var nowaAktywnosc: Intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(nowaAktywnosc)
        }
        buttonS.setOnClickListener {
            val message = Toast.makeText(
                applicationContext,
                "Los chce ze mna grac w pokera!",
                Toast.LENGTH_SHORT
            )
            message.show()
            //Przekierowuje na wiki zenka
            val adress = "https://pl.wikipedia.org/wiki/Zenon_Martyniuk"
            val channelRevolShen = Intent(ACTION_VIEW, Uri.parse(adress))
            startActivity(channelRevolShen)
        }
    }
}



