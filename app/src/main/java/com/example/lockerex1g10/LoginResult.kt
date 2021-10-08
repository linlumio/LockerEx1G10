package com.example.lockerex1g10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginResult : AppCompatActivity() {
    val accesso:Accesso = Accesso()

    lateinit var nome:String
    lateinit var benvenuto:TextView
    lateinit var listona:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_result)

        if (intent.extras==null){
            nome="Utente"
        }else{
            var extra = intent.extras
            nome = extra?.getString("nome").toString()
        }

        benvenuto = findViewById(R.id.benvenuto)
        listona = findViewById(R.id.elenco)
        benvenuto.text = "Benvenuto $nome"

        var lista:String = ""
        for ((k,v) in accesso.accesso){
            lista += "$v \n"
        }
        listona.text = lista


    }
}