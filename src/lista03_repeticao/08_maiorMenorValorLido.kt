package lista03_repeticao

fun main() {
    var maior = 0
    var menor = 0
    var numero: Int

    for (i in 1..10) {
        print("Digite um valor: ")
        numero = readln().toInt()

        if (numero > maior) {
            maior = numero
        }

        if (numero < menor || menor == 0) {
            menor = numero
        }
    }

    println()
    println("Maior: $maior")
    println("Menor: $menor")
}