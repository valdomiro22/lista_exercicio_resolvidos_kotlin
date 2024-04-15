package lista01_variaveis_esprecoes

fun main() {
    print("Numero: ")
    val numero = readln().toInt()

    val sucessorDoTriplo = (numero * 3) + 1
    val antecessorDoDobro = (numero * 2) - 1
    val soma = sucessorDoTriplo + antecessorDoDobro

    println()
    println("Sucessor do triplo: $sucessorDoTriplo")
    println("Antecessor do dobro: $antecessorDoDobro")
    println("Soma: $soma")
}