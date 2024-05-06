package lista03_repeticao

fun main() {
    var somaMultiplos = 0

    for (i in 1..1000) {
        if (i % 3 == 0 || i % 5 == 0) somaMultiplos += i
    }

    println("Soma dos multiplos: $somaMultiplos")
}