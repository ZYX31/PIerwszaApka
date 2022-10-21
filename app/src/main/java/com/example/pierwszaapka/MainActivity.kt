package com.example.pierwszaapka

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonF = findViewById<Button>(R.id.ButtonF)
        val buttonS = findViewById<Button>(R.id.ButtonS)
        buttonF.setOnClickListener{
            buttonF.text = "Działa!"
            var message = Toast.makeText(applicationContext,"Raz Mi daje raz zabiera!",Toast.LENGTH_LONG)
            message.show()
        }
        buttonS.setOnClickListener{
            var message = Toast.makeText(applicationContext,"Los chce ze mna grac w pokera!",Toast.LENGTH_SHORT)
            message.show()
        }

    }
}