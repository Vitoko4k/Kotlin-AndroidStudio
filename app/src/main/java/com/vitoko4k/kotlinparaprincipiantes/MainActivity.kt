package com.vitoko4k.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //llamada a la funcion para ser ejecutable
        //variableYConstantes()
        //tiposDeDatos()
        sentenciaIf ()
    }

    //crear una funcion
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

    private fun tiposDeDatos () {
        //4 tipos de datos principales
        //textos, enteros, decimales y buleanos

        //String
        val myString = "variable de tipo string"
        val myString2 = "variebla de tipo string 2"
        //concadenacion de string
        val myString3 = myString + " " + myString2
        println(myString3)

        //enteros (byte, short, int, long)
        val myInt = 1
        val myInt2 = 2
        //operaciones matematicas con numeros enteros
        val myInt3 = myInt + myInt2
        println(myInt3)

        //decimales (float, double)
        //terminacion en f para que sepa que es float
        val myFloat = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        //asemeja el 1 como 1.0
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2
        println(myDouble4)

        //boolean (bool)
        val myBool = true
        val myBool2 = false
        //== igual, && and
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    private fun sentenciaIf () {
        val myNumber = 10
        /*operadores condicionales
        * > mayor que
        * < menor que
        * >= mayor o igual que
        * <= menor o igual que
        * == igualdad
        * != desigualdad*/

        if (myNumber<10) {
            //concadenacion de inr con string
            println("$myNumber es menor que 10")
        } else if (myNumber>10) {
            println("$myNumber es mayor que 10")
        } else {
            println("$myNumber es igual a 10")
        }

        /*operadores logicos
        * && operador "y" ambas deben ser verdaderas
        * || operador "o" al menos una debe ser verdadera
        * ! operador "no" negar todo lo anterior*/
    }
}