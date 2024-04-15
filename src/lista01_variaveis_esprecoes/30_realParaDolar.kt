package lista01_variaveis_esprecoes

fun main() {
    print("Valor do real: ")
    val valorDoReal = readln().toDouble()
    print("Cotação do dolar: ")
    val cotacaoDolar = readln().toDouble()

    val valorEmDolar = valorDoReal * cotacaoDolar

    println()
    print("Valor correspondente em dolar: $valorEmDolar")
}