package lista01_variaveis_esprecoes

fun main() {
    print("Primeiro valor: ")
    val vl1 = readln().toInt()
    print("Segundo valor: ")
    val vl2 = readln().toInt()
    print("Terceiro valor: ")
    val vl3 = readln().toInt()

    val quadradoVl1 = vl1 * vl1
    val quadradoVl2 = vl2 * vl2
    val quadradoVl3 = vl3 * vl3

    println()
    println("Primeiro valor: $vl1 -- Seu quadrado: $quadradoVl1")
    println("Segundo valor: $vl2 -- Seu quadrado: $quadradoVl2")
    println("Terceiro valor: $vl3 -- Seu quadrado: $quadradoVl3")
}