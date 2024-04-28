package lista02_condicionais

import kotlin.math.log

fun main() {
    print("Digite um numero: ")
    val numero = readln().toInt()

    if (numero < 0) {
        println("Numero invalido")
    } else {
        val logaritmo = log(numero.toDouble(), 2.0)
        println("Logaritmo = $logaritmo")
    }
}