package com.example.ejerciciodeprogramacinorientadaaobjetospoo.classes

import com.example.ejerciciodeprogramacinorientadaaobjetospoo.attributes.AttributesSmart
import com.example.ejerciciodeprogramacinorientadaaobjetospoo.attributes.DeviceAttributes
import org.xml.sax.Attributes
import java.security.KeyStore.Entry.Attribute

open class Smartphone(brand : String, model: String, state : State, id : String, attributes : AttributesSmart) :
    Devices(brand, model, state, id, attributes )  {

}
