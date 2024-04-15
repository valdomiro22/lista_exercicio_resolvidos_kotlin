package lista01_variaveis_esprecoes

import kotlin.math.pow

fun main() {
    print("Tamanho do lada de um quadrado: ")
    val tamanhoLado = readln().toDouble()

    val area = tamanhoLado.pow(2.0)

    println()
    print("Area: $area")
}