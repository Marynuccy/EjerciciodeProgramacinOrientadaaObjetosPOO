package com.example.ejerciciodeprogramacinorientadaaobjetospoo.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.R
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivitySmartphoneBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivityTabletBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.`object`.DevicesRegister

class TabletActivity : AppCompatActivity() {

    lateinit var binding: ActivityTabletBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabletBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun agregarCelu(id: String, brand: String, number: Int) {

        DevicesRegister.listOfDevices.add(
            binding.tabletAddId.text.toString(),
            binding.tabletAddBrand.text.toString(),
            binding.tabletAddModel.text.toString(),
            binding.tabletAddState.text.toString()
        )
    }
}