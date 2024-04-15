package lista01_variaveis_esprecoes

fun main() {
    print("Volume em litros: ")
    val litros = readln().toDouble()

    val metrosCubicos = litros / 1000

    println()
    print("Metros cubicos: $metrosCubicos")
}