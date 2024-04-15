package lista01_variaveis_operacoes

fun main() {
    print("Graus em Kelvin: ")
    val kelvin = readln().toDouble()

    val celsius = kelvin - 273.15
    println()
    print("Celsius: $celsius")
}