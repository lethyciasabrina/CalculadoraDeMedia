package com.example.avaliadordenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toolbar

class ResultMedia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_media)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val txtMedia: TextView = findViewById(R.id.txtMedia)
        val txtClassificacao: TextView = findViewById(R.id.txtClassificacao)
        val result = intent.getFloatExtra("EXTRA_RESULT",0.1f)

        txtMedia.text = result.toString()

        val classificacao = if(result >= 7){
            "Parabéns, você está aprovado!"
        } else{
            "Você está reprovado! Estude mais."
        }

        txtClassificacao.text = classificacao

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}