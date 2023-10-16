package com.example.avaliadordenotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNota1: EditText = findViewById(R.id.edtNota1)
        val edtNota2: EditText = findViewById(R.id.edtNota2)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener{

            val nota1 = edtNota1.text.toString()
            val nota2 = edtNota2.text.toString()

            if(nota1.isNotEmpty() && nota2.isNotEmpty()){
                val media1: Float = nota1.toFloat()
                val media2: Float = nota2.toFloat()

                val mediaFinal: Float = (media1 + media2) / 2

                edtNota1.text.clear();
                edtNota2.text.clear();

                val intent = Intent(this,ResultMedia::class.java)
                    .apply {
                        putExtra("EXTRA_RESULT", mediaFinal)
                    }
                startActivity(intent)

            } else {
                Toast.makeText(this,"PREENCHA TODOS OS CAMPOS",Toast.LENGTH_LONG).show()
            }

        }


    }
}