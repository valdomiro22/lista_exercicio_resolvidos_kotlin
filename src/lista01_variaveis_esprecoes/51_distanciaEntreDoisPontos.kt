package lista01_variaveis_esprecoes

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Coordenada X: ")
    val coordenadaX = readln().toDouble()
    print("Coordenada Y: ")
    val coordenadaY = readln().toDouble()

    val distancia = sqrt(((coordenadaX - 0).pow(2.0)) + ((coordenadaY - 0).pow(2.0)))

    println()
    print("Distancia: $distancia")
}