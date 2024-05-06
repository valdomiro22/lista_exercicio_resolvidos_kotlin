package lista03_repeticao

fun main() {

    var somaPrimos = 0

    print("Digite um numero: ")
    val numero = readln().toInt()

    println()
    var qtDivisores: Int
    for (i in 1..numero) {

        qtDivisores = 0

        for (j in 1..i) {
            if (i % j == 0) {
                qtDivisores++
            }
        }

        if (qtDivisores == 2) {
            println("$i")
            somaPrimos += i
        }
    }

    println()
    println("Soma do primos: $somaPrimos")
}