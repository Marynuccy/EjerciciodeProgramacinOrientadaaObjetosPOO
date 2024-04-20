package com.example.ejerciciodeprogramacinorientadaaobjetospoo
 object DevicesRegister {
     val listOfDevices = mutableListOf<Devices>()

     fun addDevice(device : Devices) : String{
         val index = listOfDevices.indexOfFirst { it.id == device.id }
         if(index == -1){
         listOfDevices.add(device)
         }
         return "the device is already registered"
     }

     fun deleteDevice(id : String) : String{
         val index = listOfDevices.indexOfFirst { it.id == id }
         if(index != -1){
             listOfDevices.remove(listOfDevices[index])
         }
         return "the device is not registered"
     }

}