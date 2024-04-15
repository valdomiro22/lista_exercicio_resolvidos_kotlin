package lista01_variaveis_esprecoes

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Cateto A: ")
    val catetoA = readln().toDouble()
    print("Cateto B: ")
    val catetoB = readln().toDouble()

    val hipotenusa = sqrt(catetoA.pow(2) + catetoB.pow(2))

    println()
    print("Valor da hipotenusa: $hipotenusa")
}