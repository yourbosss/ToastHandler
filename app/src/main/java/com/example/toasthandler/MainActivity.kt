package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //объявление кнопки.
    private lateinit var mybutton: Button

    // связали с ативностью.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связали переменную с элементом на экране.
        mybutton = findViewById(R.id.button_ok)
        //привязываем функцию сообщения к нашей кнопки
        mybutton.setOnClickListener{showToast()}
    }

    private fun showToast(){
        // как вызвать Toast - всплывающее сообщение(2 секунды)
        val myToast = Toast.makeText(this, "Кнопка OK", Toast.LENGTH_SHORT)
         // показываем.
        myToast.show()
        }
    }


