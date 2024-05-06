package lista03_repeticao

import kotlin.math.pow

fun main() {
    var somaQuadrados = 0.0
    var somaNumeros = 0.0

    for (i in 1..100) {
        somaQuadrados += i.toDouble().pow(2)
        somaNumeros += i
    }

    val quadradoDaSoma = somaNumeros.pow(2)

    println("Soma dos quadrados: $somaQuadrados")
    println("Quadrado da soma: $quadradoDaSoma")
}