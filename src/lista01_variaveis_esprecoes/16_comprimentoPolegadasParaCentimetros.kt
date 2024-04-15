package lista01_variaveis_esprecoes

fun main() {
    print("Comprimento em polegadas: ")
    val polegadas = readln().toDouble()

    val centimetros = polegadas * 2.54

    println()
    print("Centimetros: $centimetros")
}