package com.example.ejerciciodeprogramacinorientadaaobjetospoo.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.R
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.attributes.AttributesComputer
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivityComputerBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.`object`.DevicesRegister

class ComputerActivity : AppCompatActivity() {

    lateinit var binding: ActivityComputerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComputerBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun agregarCelu(id: String, brand: String, number: Int, atributes : AttributesComputer) {

            DevicesRegister.listOfDevices.add(
                binding.computerAddId.text.toString(),
                binding.computerAddMarca.text.toString(),
                binding.computerAddModel.text.toString(),
                binding.computerAddState.text.toString()
            )
        }
    }
}