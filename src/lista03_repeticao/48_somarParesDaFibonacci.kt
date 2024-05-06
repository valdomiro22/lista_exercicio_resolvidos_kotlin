package lista03_repeticao

fun main() {
    var vlA = 1
    var vlB = 0
    var fibomacci = 0
    var soma = 0

    while (fibomacci < 4_000_000) {
        fibomacci = vlA + vlB
        vlA = vlB
        vlB = fibomacci

        if (fibomacci % 2 == 0) {
            soma += fibomacci
        }
    }

    println()
    println("Soma: $soma")
}