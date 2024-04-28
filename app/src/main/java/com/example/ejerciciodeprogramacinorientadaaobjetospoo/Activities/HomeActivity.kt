package com.example.ejerciciodeprogramacinorientadaaobjetospoo.Activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.R
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
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
        binding.btDeleteHome.setOnClickListener {
            val myIntent = Intent(this, DeleteActivity::class.java)
            startActivity(myIntent)
        }

        binding.btAddHome.setOnClickListener {
            val myIntent = Intent(this, AddActivity::class.java)
            startActivity(myIntent)
        }

        binding.btSearchHome.setOnClickListener {
            val myIntent = Intent(this, SearchActivity::class.java)
            startActivity(myIntent)
        }
    }

}
