package lista03_repeticao

fun main() {
    var sequencia1 = 0
    var sequencia2 = 0
    var sequencia3 = 0
    val vln = 8

    for (i in 0..vln) {
        sequencia1 += i
    }

    for (i in 1 ..< vln) {
        var aux = 0

        if (i % 2 == 0) {
            aux = i * (-1)
        }

        sequencia2 += i + aux
    }

    for (i in 1 ..< vln) {
        if (i % 2 != 0) sequencia3 += i
    }

    println("Sequencia1: $sequencia1")
    println("Sequencia2: $sequencia2")
    println("Sequencia3: $sequencia3")
}