package lista03_repeticao

fun main() {
    print("Digite um numero: ")
    val numero = readln().toInt()

    var qtDivisores = 0

    for (j in 1..numero) {
        if (numero % j == 0) {
            qtDivisores++
        }
    }

    if (qtDivisores == 2) {
        println("É primo")
    } else {
        println("Não é primo")
    }
}