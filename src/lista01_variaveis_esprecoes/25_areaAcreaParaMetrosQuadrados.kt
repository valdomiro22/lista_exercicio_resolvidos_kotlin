package lista01_variaveis_esprecoes

fun main() {
    print("Area em acres: ")
    val acres = readln().toDouble()

    val metrosQuadrados = acres * 4048.58

    println()
    print("Metros quadrados: $metrosQuadrados")
}