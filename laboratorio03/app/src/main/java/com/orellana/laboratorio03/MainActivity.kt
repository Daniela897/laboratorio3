package com.orellana.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var moneycounter: TextView
    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var coinCents: ImageView
    private lateinit var dollar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

        fiveCents.setOnClickListener { add(0.05) }
    }

    fun bind ()
    {
        moneycounter = findViewById(R.id.textView)
        fiveCents = findViewById(R.id.five_imageView)
    }

    private fun add(num: Double){
          moneycounter.text.toString().toDouble()
        var valor_modificado: Double

                valor_modificado= moneycounter.text.toString().toDouble()


        valor_modificado=valor_modificado+0.10

        moneycounter.text=valor_modificado.toString()
    }

}












