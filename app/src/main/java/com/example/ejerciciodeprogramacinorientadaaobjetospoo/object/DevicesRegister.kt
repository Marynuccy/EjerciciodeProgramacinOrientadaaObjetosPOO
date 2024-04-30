package com.example.ejerciciodeprogramacinorientadaaobjetospoo.`object`

import com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes.Devices
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes.State

object DevicesRegister {
     val listOfDevices = mutableListOf<Devices>(Devices("Motorola", "E7 plus", State.NEW, "Tomi gay"))
 }
