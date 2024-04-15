package lista01_variaveis_esprecoes

fun main() {
    print("Comprimento em centimetros: ")
    val centimetros = readln().toDouble()

    val polegadas = centimetros / 2.54

    println()
    print("Polegadas: $polegadas")
}