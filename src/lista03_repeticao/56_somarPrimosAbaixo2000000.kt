package lista03_repeticao

fun main() {
    val limite = 20_000
    var somaPrimos = 0

    var qtDivisores: Int
    for (i in 1..limite) {

        qtDivisores = 0

        for (j in 1..i) {
            if (i % j == 0) {
                qtDivisores++
            }
        }

        if (qtDivisores == 2) {
            println(i)
            somaPrimos += i
        }
    }

    println()
    println("Soma dos primos: $somaPrimos")
}