package lista01_variaveis_esprecoes

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Raio de um circulo: ")
    val raio = readln().toDouble()

    val area = PI * raio.pow(2)

    println()
    print("Area do circulo: $area")
}