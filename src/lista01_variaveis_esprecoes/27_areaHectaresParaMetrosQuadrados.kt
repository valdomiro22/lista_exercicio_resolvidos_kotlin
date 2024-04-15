package lista01_variaveis_esprecoes

fun main() {
    print("Area em hectares: ")
    val hectares = readln().toDouble();

    val metrosQuadrados = hectares * 10000

    println()
    print("Metros quadrados: $metrosQuadrados")
}