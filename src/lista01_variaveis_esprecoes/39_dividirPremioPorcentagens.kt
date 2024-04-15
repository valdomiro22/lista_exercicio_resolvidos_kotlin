package lista01_variaveis_esprecoes

const val PREMIO = 780_000.00
//const val PREMIO = 78000000

fun main() {
    val premioGanhador1 = PREMIO * 0.46
    val premioGanhador2 = PREMIO * 0.32
    val premioGanhador3 = PREMIO - (premioGanhador1 + premioGanhador2)

    println("Premio do ganhador 1 = $premioGanhador1")
    println("Premio do ganhador 2 = $premioGanhador2")
    println("Premio do ganhador 3 = $premioGanhador3")
}