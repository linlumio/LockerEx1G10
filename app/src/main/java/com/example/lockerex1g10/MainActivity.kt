package com.example.lockerex1g10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val accesso = mapOf<String, String>("pippo" to "goofy", "topolino" to "mickey", "paperino" to "donald", "batman" to "bruce", "ironman" to "stark", "alan" to "tnt")
    //prima schermata
    lateinit var bottone:Button
    lateinit var nome:EditText
    lateinit var pw:EditText
    //seconda schermata
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottone = findViewById(R.id.log)
    }
}