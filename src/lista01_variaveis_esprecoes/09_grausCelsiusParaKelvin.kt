package lista01_variaveis_esprecoes

fun main() {
    print("Temperatura em graus Celsius: ")
    val celsius = readln().toDouble()

    val kelvin = celsius + 273.15

    println()
    print("Kelvin: $kelvin")
}