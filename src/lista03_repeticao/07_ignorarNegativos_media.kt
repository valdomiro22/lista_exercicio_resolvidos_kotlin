package lista03_repeticao

fun main() {
    var soma = 0
    var numero: Int

    for (i in 1..10) {
        print("Digite o valor $i/10: ")
        numero = readln().toInt()

        if (numero > 0) {
            soma += numero
        }
    }

    val media = soma / 10

    println()
    print("Media: $media")
}