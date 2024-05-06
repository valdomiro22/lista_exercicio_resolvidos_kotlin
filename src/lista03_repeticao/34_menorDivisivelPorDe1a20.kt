package lista03_repeticao

fun main() {
    var qtDivisores = 0
    var contator = 0

    while (qtDivisores < 10) {
        qtDivisores = 0
        contator++

        for (i in 1..10) {
            if (contator % i == 0) {
                qtDivisores++
            }
        }
    }
    println()
    println(contator)
}