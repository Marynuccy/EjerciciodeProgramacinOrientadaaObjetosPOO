package com.example.ejerciciodeprogramacinorientadaaobjetospoo.attributes

import com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes.Sim

data class AttributesSmart(
     val screenSize: String,
     val operativeSystem: String,
     val sim: Sim,
     val cameraPixel: String
) : DeviceAttributes
