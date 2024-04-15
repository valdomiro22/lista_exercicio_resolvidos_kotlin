package lista01_variaveis_esprecoes

import kotlin.math.ceil

fun main() {
    print("Altura do degrau: ")
    val alturaDegrau = readln().toDouble()
    print("Altura a ser alcançada: ")
    val alturaDesejada = readln().toDouble()

    val qtDegraus = ceil(alturaDesejada / alturaDegrau)

    println()
    print("Quantidade de degraus: $qtDegraus")
}