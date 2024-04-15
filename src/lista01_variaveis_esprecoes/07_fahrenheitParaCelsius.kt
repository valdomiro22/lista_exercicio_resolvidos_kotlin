package lista01_variaveis_operacoes

fun main() {
    print("Graus em Fahrenheit: ")
    val fah = readln().toDouble()

    val celsius = 5 * (fah - 32) / 9.0
    println()
    print("Fahrenheit: $celsius")
}