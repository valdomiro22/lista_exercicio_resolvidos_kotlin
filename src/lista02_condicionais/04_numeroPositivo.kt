package lista02_condicionais

import kotlin.math.sqrt

fun main() {
    print("Digite um numero: ")
    val numero = readln().toInt()

    if (numero > 0) {
        val numeroAoQuadrado = numero * numero
        val raizDoNumero = sqrt(numero.toDouble())

        println()
        print("$numero ao quadrado = $numeroAoQuadrado \n")
        print("$numero raiz quadrada = $raizDoNumero")
    }
}