package lista01_variaveis_esprecoes

fun main() {
    print("Digite um numero de 3 Digitos: ")
    var numero = readln().toInt()

    val ultimo = numero % 10
    numero /= 10
    val doMeio = numero % 10
    numero /= 10

    println()
    println(ultimo)
    println(doMeio)
    println(numero)
    println("$ultimo$doMeio$numero")
}