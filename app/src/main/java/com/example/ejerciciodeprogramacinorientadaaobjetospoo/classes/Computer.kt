package com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes

import com.example.ejerciciodeprogramacinorientadaaobjetospoo.attributes.AttributesComputer
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.attributes.DeviceAttributes

class Computer(brand : String, model : String, state : State, id : String, attributes : AttributesComputer,
) :
    Devices(brand, model, state, id, attributes ) {

}
