package lista03_repeticao

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite um numero, ou valo negativo para finalizar: ")
    var valor = readln().toDouble()

    if (valor <= 0.0) {
        println("Finalizando sem calculos")
    } else {
        do {
            val quadrado = valor * valor
            val cubo = valor.pow(3)
            val raiz = sqrt(valor)

            println("Quadrado: $quadrado")
            println("Cubo: $cubo")
            println("Raiz: $raiz")

            println()
            print("Digite um numero, ou valo negativo para finalizar: ")
            valor = readln().toDouble()
        } while (valor > 0)

        println("Programa finalizado")
    }
}