package lista03_repeticao

fun main() {
    var cont = 0
    var qtMultiplos = 0

    print("Digite o valor de N: ")
    val qtNumeros = readln().toInt()
    print("Digite o valor de i: ")
    val vli = readln().toInt()
    print("Digite o valor de j: ")
    val vlj = readln().toInt()

    while (qtMultiplos < qtNumeros) {
        if (cont % vli == 0 || cont % vlj == 0) {
            qtMultiplos++

            print("$cont ")
        }

        cont++
    }
}