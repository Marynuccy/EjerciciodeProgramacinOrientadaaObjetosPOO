package com.example.ejerciciodeprogramacinorientadaaobjetospoo.Classes

import com.example.ejerciciodeprogramacinorientadaaobjetospoo.Object.DevicesRegister

open class Devices(val brand: String, val model: String, val state: State, val id: String) {

    fun showDevice(id: String): Devices {
        val index = DevicesRegister.listOfDevices.indexOfFirst { it.id == id }
        return DevicesRegister.listOfDevices[index]
    }

    fun addDevice(device : Devices) : String{
        val index = DevicesRegister.listOfDevices.indexOfFirst { it.id == device.id }
        if(index == -1){
            DevicesRegister.listOfDevices.add(device)
        }
        return "the device is already registered"
    }

    fun deleteDevice(id : String) : String{
        val index = DevicesRegister.listOfDevices.indexOfFirst { it.id == id }
        if(index != -1){
            DevicesRegister.listOfDevices.remove(DevicesRegister.listOfDevices[index])
        }
        return "the device is not registered"
    }

}
