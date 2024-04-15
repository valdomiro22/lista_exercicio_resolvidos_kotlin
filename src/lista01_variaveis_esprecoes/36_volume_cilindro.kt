package lista01_variaveis_esprecoes

import kotlin.math.PI

fun main() {
    print("Altura do cilindro: ")
    val altura = readln().toDouble()
    print("Raio do cilindro: ")
    val raio = readln().toDouble()

    val volume = PI * (raio * raio) * altura

    println()
    print("Volume: $volume")
}