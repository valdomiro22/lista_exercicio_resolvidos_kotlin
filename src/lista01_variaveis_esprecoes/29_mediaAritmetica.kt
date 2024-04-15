package lista01_variaveis_esprecoes

fun main() {
    print("Nota 1: ")
    val nota1 = readln().toDouble()
    print("Nota 2: ")
    val nota2 = readln().toDouble()
    print("Nota 3: ")
    val nota3 = readln().toDouble()
    print("Nota 4: ")
    val nota4 = readln().toDouble()

    val soma = nota1 + nota2 + nota3 + nota4
    val media = soma / 4.0

    println()
    print("Media das notas: $media")
}