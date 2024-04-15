package lista01_variaveis_esprecoes

fun main() {
    print("Informe a idade da pessoa: ")
    val idade = readln().toInt()
    print("Ano atual: ")
    val ano = readln().toInt()

    val anoNascimento = ano - idade

    println()
    print("Ano de nascimento: $anoNascimento")
}