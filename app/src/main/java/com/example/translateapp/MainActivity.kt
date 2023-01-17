package com.example.translateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.translateapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding //declaration de la variable binding



    var value : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





 // Initialisation de la variable binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.activity2.setOnClickListener{
            Toast.makeText(this, "plus", Toast.LENGTH_LONG).show()
            value++
           binding.compteur.setText("$value")
        }






    }
}