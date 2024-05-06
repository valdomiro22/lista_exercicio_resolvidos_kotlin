package lista03_repeticao

fun main() {
    print("Digite um numero entre 100 e 999: ")
    var numero = readln().toInt()

    for (i in 0..2) {
        val digito = numero % 10
        numero /= 10

        println(digito)
    }
}