package com.example.pierwszaapka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//Glowny 3 warstwy
class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }
    override fun onUserInteraction(){
        super.onUserInteraction()

        findViewById<Button>(R.id.mojPrzycisk).setOnClickListener{
            findViewById<Button>(R.id.mojPrzycisk).text = "Ok"
        }
            }
        }