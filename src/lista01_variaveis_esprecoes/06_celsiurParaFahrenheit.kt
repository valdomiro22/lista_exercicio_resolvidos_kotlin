package lista01_variaveis_operacoes

fun main() {
    print("Graus em Celsius: ")
    val celsius = readln().toInt()

    val fahrenheit = celsius * (9.0/5) + 32
    println()
    print("Fahrenheit: $fahrenheit")
}