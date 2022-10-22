package com.example.pierwszaapka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Glowny 2 warstwy
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun onUserInteraction(){
        super.onUserInteraction()

        if(R.id.Password.isfocused){
            if(R.id.Password.length() < 8){
               R.id.Password.setText("Haslo za krotkie!")
                R.id.Password.visibility
            }
        }
    }

}