package lista03_repeticao

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var dado1: Int
    var dado2: Int

    print("Digite a quantidade de lançamentos dos dados: ")
    val qtLancamentos = readln().toInt()

    for (i in 1..qtLancamentos) {
        dado1 = Random.nextInt(1..6)
        dado2 = Random.nextInt(1..6)

        if (dado1 > dado2) {
            println("dado1 > dado2 --> $dado1 > $dado2")
        } else if (dado2 == dado1) {
            println("dado2 = dado1 --> $dado1 = $dado2")
        } else {
            println("dado1 < dado2 --> $dado1 < $dado2")
        }
    }
}