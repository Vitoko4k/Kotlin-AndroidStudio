package com.vitoko4k.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variableYConstantes()
    }

    private fun variableYConstantes () {
        //variables
        var myFirstVariable = "Hola Victor"
        //var = variable

        //imprimir por consola
        println(myFirstVariable)

        //cambiar valor de la variable
        myFirstVariable = "¿Como estuvo tu dia?"

        println(myFirstVariable)

        //no se puede cambiar el valor de la variable de texto a numero
        //myFirstVariable = 1

        var mySecondVariable = "Segunda variable creada"
        println(mySecondVariable)

        //le otorgo el valor de mi primera variable a mi segunda variable
        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "Podemos cambiar el valor de la variable"
        mySecondVariable = "cuantas veces queramos"
        println(myFirstVariable)
        println(mySecondVariable)

        //constantes
        val myFirstConstante = "mi primera constante"
        //val = constante
        println(myFirstConstante)

        //las constantes no se pueden cambiar el valor
        //myFirstConstante = "no se puede"

        //creamos una constante para darle el utlimo valor de una variable para no ser modificada nunca mas
        val mySecondConstante = myFirstVariable
        println(mySecondConstante)
    }
}