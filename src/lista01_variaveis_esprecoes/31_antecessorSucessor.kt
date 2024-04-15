package lista01_variaveis_esprecoes

fun main() {
    print("Numero: ")
    val numero = readln().toInt()

    println()
    print("Antecessor: ${numero -1}, Sucessor: ${numero + 1}")
}