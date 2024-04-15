package lista01_variaveis_esprecoes

fun main() {
    print("Comprimento do terreno: ")
    val comprimento = readln().toDouble()
    print("Largura do terreno: ")
    val largura = readln().toDouble()
    print("Preço do metro de tela: ")
    var precoMetroTela = readln().toDouble()

    val cerca = (comprimento * 2) + (largura * 2)
    val custo = cerca * precoMetroTela

    println()
    print("Curso: $custo")
}