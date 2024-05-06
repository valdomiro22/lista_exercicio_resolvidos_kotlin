package lista03_repeticao

fun main() {
    var numero: Int
    var soma = 0

    for (i in 1..10) {
        print("Digite o valor $i/10: ")
        numero = readln().toInt()
        soma += numero
    }

    val media = soma / 10.0
    println("Media: $media")
}