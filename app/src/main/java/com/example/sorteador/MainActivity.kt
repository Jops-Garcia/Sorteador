package com.example.sorteador

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view : View) {
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        
        val range  = findViewById<TextView>(R.id.num_range)
        if(range.text.isEmpty()) {
            range.setText("0")
        }
        
        val bound  = Integer.parseInt(range.text.toString())
        if (bound>0) {
            val numero = Random().nextInt(bound) + 1 //remove 0
            textoResultado.setText("Número sorteado: $numero")
        }

    }


}