package lista01_variaveis_operacoes

fun main() {
    var n1: Int
    var n2: Int
    var n3: Int
    var soma: Int

    print("Digite um numero: ")
    n1 = readln().toInt()
    print("Digite outro numero: ")
    n2 = readln().toInt()
    print("Digite mais um numero: ")
    n3 = readln().toInt()

    soma = n1 + n2 + n3

    println()
    print(soma)
}