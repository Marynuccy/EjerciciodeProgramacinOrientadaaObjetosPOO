package com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.R
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ActivitySearchBinding
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.databinding.ItemDeviceBinding

class DevicesAdapter(private val listOfDevices: List<Devices>) : RecyclerView.Adapter<DevicesHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DevicesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_device,parent,false)
        return DevicesHolder(view)
    }

    override fun getItemCount(): Int {
        return  listOfDevices.size
    }

    override fun onBindViewHolder(holder: DevicesHolder, position: Int) {
        holder.render(listOfDevices[position])
    }
}

class DevicesHolder(view : View) : RecyclerView.ViewHolder(view){

    private val binding = ItemDeviceBinding.bind(view)

    fun render(value : Devices){
        binding.textBrand.text = value.brand
        binding.textId.text = value.id
        binding.textModel.text = value.model
        binding.textState.text = value.state.toString()
    }

}