package lista03_repeticao

fun main() {
    var cont = 1
    var qtMultiplos = 0

    while (qtMultiplos < 5) {
        if (cont % 3 == 0) {
            qtMultiplos++
            println(cont)
        }
        cont++
    }
}