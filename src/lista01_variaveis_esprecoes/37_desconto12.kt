package lista01_variaveis_esprecoes

fun main() {
    print("Valor do produto: ")
    val valor = readln().toDouble()

    val valorConDesconto = valor * (1 - 0.12)

    println()
    print("Valor com desconto: $valorConDesconto")
}