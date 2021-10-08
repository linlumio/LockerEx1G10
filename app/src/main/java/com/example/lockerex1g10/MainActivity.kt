package com.example.lockerex1g10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //val accesso = mapOf<String, String>("pippo" to "goofy", "topolino" to "mickey", "paperino" to "donald", "batman" to "bruce", "ironman" to "stark", "alan" to "tnt")
    val accesso:Accesso = Accesso()
    //prima schermata
    lateinit var bottone:Button
    lateinit var nome:EditText
    lateinit var pw:EditText
    //seconda schermata va nella relativa classe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottone = findViewById(R.id.log)
        nome = findViewById(R.id.user)
        pw = findViewById(R.id.pws)

        bottone.setOnClickListener{
            var nm = nome.text.toString().lowercase()
            var pssw = pw.text.toString()

            if(accesso.accesso.get(nm)==pssw){
                val intent = Intent(this, LoginResult::class.java).apply {
                    putExtra("nome", nm)
                }
                startActivity(intent)
            }else{
                val toast = Toast.makeText(this,  "Utente o password errati" , Toast.LENGTH_LONG)
                //the default toast view group is a relativelayout
                val toastLayout = toast.getView() as ViewGroup
                val toastTV =  toastLayout.getChildAt(0) as TextView
                toastTV.setTextSize(30F)
                toast.show()
            }

        }
    }
}