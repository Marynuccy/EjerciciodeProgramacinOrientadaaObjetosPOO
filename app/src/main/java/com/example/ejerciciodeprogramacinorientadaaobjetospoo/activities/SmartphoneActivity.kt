package com.example.ejerciciodeprogramacinorientadaaobjetospoo.activities

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.R
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes.State
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivityComputerBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivitySmartphoneBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.`object`.DevicesRegister

class SmartphoneActivity : AppCompatActivity() {

    lateinit var binding: ActivitySmartphoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartphoneBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val spinner: Spinner = findViewById(R.id.stateSpinner)
        val options =
            State.entries.map { it.name } // Obtener los nombres de todas las opciones de la enum class
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedState = State.entries[position] // Obtener el estado seleccionado
                adapter.getItem(position)?.let {
                    adapter.remove(it)
                    adapter.insert(selectedState.name, position)
                }

                fun onNothingSelected(parent: AdapterView<*>?) {
                    // Manejar caso cuando no se selecciona nada
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                (State.NEW)
            }

        }


    }
}