package lista02_condicionais

import kotlin.math.sqrt

fun main() {
    print("Digite um numero: ")
    val numero = readln().toDouble()

    if (numero > 0) {
        val raiz = sqrt(numero)
        println("Raiz: $raiz")
    } else {
        println("Número inválido")
    }
}