package lista01_variaveis_esprecoes

fun main() {
    print("Area em metros quadrados: ")
    val metrosQuadrados = readln().toDouble()

    val hectares = metrosQuadrados * 0.0001

    println()
    print("Hectares: $hectares")
}