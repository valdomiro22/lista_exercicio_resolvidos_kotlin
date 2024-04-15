package lista01_variaveis_esprecoes

fun main() {
    print("Digite um numero inteiro de 4 dígitos (de 1000 a 9999): ")
    var numero = readln().toInt()

    val d1 = numero % 10
    println(d1)

    numero /= 10
    val d2 = numero % 10
    println(d2)

    numero /= 10
    val d3 = numero % 10
    println(d3)

    numero /= 10
    val d4 = numero % 10
    println(d4)

}