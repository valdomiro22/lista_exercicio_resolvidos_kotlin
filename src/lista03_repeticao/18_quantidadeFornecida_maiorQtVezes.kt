package lista03_repeticao

fun main() {
    print("Quantos numeros vai digitar: ")
    val qtNumeros = readln().toInt()

    var maior = 0
    var qtVezes = 0

    for (i in 0..qtNumeros) {
        println("Digite um numero: ")
        val numero = readln().toInt()

        if (numero > maior) {
            maior = numero
            qtVezes++
        }
    }

    println()
    println("Maior numero: $maior")
    println("Quantidade de vezes que foi lido: $qtVezes")
}