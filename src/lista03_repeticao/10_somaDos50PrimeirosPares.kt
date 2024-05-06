package lista03_repeticao

fun main() {

    var soma = 0
    var cont = 1
    var qtPares = 0
    var indice = 0

    while (qtPares < 50) {
        if (cont % 2 == 0) {
            qtPares++
            soma += cont
            print("$indice - $cont")
            indice++
        }
        println()
        cont++
    }

    println("Soma: $soma")
}