package lista03_repeticao

fun main() {
    print("Digite o valor de N: ")
    val vln = readln().toInt()

    var cont = 1
    var qtNumeros = 0
    while (qtNumeros < vln) {
        if (cont % 2 == 0) {
            qtNumeros++
            println(cont)
        }
        cont++
    }
}