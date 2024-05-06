package lista03_repeticao

import kotlin.random.Random

fun main() {
    val numeroAleatorio = Random.nextInt(1000)
    var qtTentativas = 0

    do {
        qtTentativas++

        print("Tente acertar o numero secreto: ")
        val tentativa = readln().toInt()

        if (tentativa < numeroAleatorio) {
            println("Tentativa < Numero secreto")
        } else if (tentativa > numeroAleatorio) {
            println("Tentativa > Numero secreto")
        } else {
            println()
            println("PARABÉNS VOCÊ ACERTOU $numeroAleatorio = $tentativa")
            println()
        }
    } while (tentativa != numeroAleatorio)

    println("Quantidade de tentativas: $qtTentativas")
}