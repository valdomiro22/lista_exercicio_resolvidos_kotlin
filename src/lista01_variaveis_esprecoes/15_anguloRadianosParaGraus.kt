package lista01_variaveis_esprecoes

import kotlin.math.PI

fun main() {
    print("Angulo em radianos: ")
    val radianos = readln().toDouble()

    val graus = radianos * (180 / PI)

    println()
    print("Graus: $graus")
}