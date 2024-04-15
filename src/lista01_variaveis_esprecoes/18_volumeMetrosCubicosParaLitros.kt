package lista01_variaveis_esprecoes

fun main() {
    print("Volume em metros cubicos: ")
    val metrosCubicos = readln().toDouble()

    val litros = metrosCubicos * 1000

    println()
    print("Litros: $litros")
}