package lista02_condicionais

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite o valor de A: ")
    val vlA = readln().toDouble()
    if (vlA == 0.0) {
        println("A = 0. Não é uma equação do segundo grau")
    } else {
        print("Digite o valor de B: ")
        val vlB = readln().toDouble()
        print("Digite o valor de C: ")
        val vlC = readln().toDouble()

        val delta = vlB.pow(2) - (4 * vlA * vlC)

        if (delta < 0.0) {
            println("Não existe raiz")
        } else if (delta == 0.0) {
            val raiz = (- vlB + sqrt(delta)) / 2 * vlA
            println("Raiz única: $raiz")
        } else {
            val x1 = (- vlB + sqrt(delta)) / 2 * vlA
            val x2 = (- vlB - sqrt(delta)) / 2 * vlA

            println("X1 = $x1")
            println("X2 = $x2")
        }
    }
}