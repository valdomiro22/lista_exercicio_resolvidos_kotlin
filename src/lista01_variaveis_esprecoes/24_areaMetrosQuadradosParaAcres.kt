package lista01_variaveis_esprecoes

fun main() {
    print("Area em metros quadrados: ")
    val metrosQuadrados = readln().toDouble()

    val acres = metrosQuadrados * 0.000247

    println()
    print("Acres: $acres")
}