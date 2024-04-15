package lista01_variaveis_esprecoes

fun main() {
    print("Velocidade em Km/h: ")
    val kmH = readln().toDouble()

    val ms = kmH / 3.6

    println()
    print("m/s: $ms")
}