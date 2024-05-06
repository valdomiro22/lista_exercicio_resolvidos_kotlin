package lista03_repeticao

fun main() {
    var divisor = 0

    print("Digite um numero: ")
    var numero = readln().toInt()

    while (divisor < 1) {
        if (numero % 11 == 0 || numero % 13 == 0 || numero % 17 == 0) {
            println(numero)
            divisor++
        }

        numero++
    }
}