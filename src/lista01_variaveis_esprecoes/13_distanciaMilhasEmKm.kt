package lista01_variaveis_esprecoes

fun main() {
    print("Distancia em milhas: ")
    val milhas = readln().toDouble()

    val km = 1.61 * milhas

    println()
    print("km/h: $km")
}