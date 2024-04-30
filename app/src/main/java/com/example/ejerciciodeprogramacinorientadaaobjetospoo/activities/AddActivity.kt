package com.example.ejerciciodeprogramacinorientadaaobjetospoo.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.R
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivityAddBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivityDeleteBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.`object`.DevicesRegister

class AddActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        actions()
    }
    fun actions() {
        binding.btComputerAdd.setOnClickListener {
            val myIntent = Intent(this, ComputerActivity::class.java)
            startActivity(myIntent)
        }
        binding.btTabletAdd.setOnClickListener {
            val myIntent = Intent(this, TabletActivity::class.java)
            startActivity(myIntent)
        }

        binding.btSmartphoneAdd.setOnClickListener {
            val myIntent = Intent(this, SmartphoneActivity::class.java)
            startActivity(myIntent)
        }
    }
}