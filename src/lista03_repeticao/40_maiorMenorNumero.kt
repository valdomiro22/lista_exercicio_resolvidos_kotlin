package lista03_repeticao

fun main() {
    var maior = 0
    var menor = 0

    print("Digite um numero inteiro, ou um numero negativo para finalizar: ")
    var numero = readln().toInt()

    if (numero <= 0) {
        println("Finalizando sem calculos")
    } else {
        do {
            if (numero > maior) maior = numero
            if (numero < menor || menor == 0) menor = numero

            print("Digite um numero inteiro, ou um numero negativo para finalizar: ")
            numero = readln().toInt()

        } while (numero > 0)

        println()
        println("Maior numero digitado: $maior")
        println("Menor numero digitado: $menor")
    }
}