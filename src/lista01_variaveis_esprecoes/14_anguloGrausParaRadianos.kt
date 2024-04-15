package lista01_variaveis_esprecoes

import kotlin.math.PI

fun main() {
    println("Angulo em graus: ")
    val graus = readln().toDouble()

    val radianos = graus * (PI / 180)

    println()
    print("Radianos: $radianos")
}