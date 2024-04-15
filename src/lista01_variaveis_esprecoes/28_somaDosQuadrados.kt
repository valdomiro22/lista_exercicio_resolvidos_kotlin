package lista01_variaveis_esprecoes

fun main() {
    print("Valor 1: ")
    val vl1 = readln().toInt()
    print("Valor 2: ")
    val vl2 = readln().toInt()
    print("Valor 3: ")
    val vl3 = readln().toInt()

    val quadrodo1 = vl1 * vl1
    val quadrodo2 = vl2 * vl2
    val quadrodo3 = vl3 * vl3
    val somaQuadrados = quadrodo1 + quadrodo2 + quadrodo3

    println()
    println("Valores: $vl1, $vl2, $vl3")
    println("Quadrados: $quadrodo1, $quadrodo2, $quadrodo3")
    println("Soma dos quadrados: $somaQuadrados")
}