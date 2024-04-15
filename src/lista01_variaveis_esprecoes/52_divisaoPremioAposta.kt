package lista01_variaveis_esprecoes

fun main() {

    val premio = 274_695.83

    print("Investimento apostador 1: ")
    val investimentoApostador1 = readln().toDouble()
    print("Investimento apostador 2: ")
    val investimentoApostador2 = readln().toDouble()
    print("Investimento apostador 3: ")
    val investimentoApostador3 = readln().toDouble()

    val totalApostado = investimentoApostador1 + investimentoApostador2 + investimentoApostador3
    val porcentagemApostador1 = investimentoApostador1 / totalApostado
    val porcentagemApostador2 = investimentoApostador2 / totalApostado
    val porcentagemApostador3 = investimentoApostador3 / totalApostado

    val premioApostador1 = premio * porcentagemApostador1
    val premioApostador2 = premio * porcentagemApostador2
    val premioApostador3 = premio - (premioApostador1 + premioApostador2)

    println()
    println("Total apostado: $totalApostado")
    println("Porcentagem do apostador 1: ${porcentagemApostador1 * 100}")
    println("Porcentagem do apostador 2: ${porcentagemApostador2 * 100}")
    println("Porcentagem do apostador 3: ${porcentagemApostador3 * 100}")
    println()
    println("Premio do apostador 1: $premioApostador1")
    println("Premio do apostador 2: $premioApostador2")
    println("Premio do apostador 3: $premioApostador3")

}