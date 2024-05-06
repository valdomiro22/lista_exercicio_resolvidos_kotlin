package lista03_repeticao

fun main() {

    var qtNumeros = 0
    var somaNumeros = 0
    var somaPares = 0
    var maiorNumero = 0
    var menorNumero = 0
    var qtNumerosPares = 0
    val mediaGeral: Double
    val mediaPares: Double

    print("Digite um numero ou zero para finalizar: ")
    var numero = readln().toInt()

    if (numero == 0) {
        println("Finalizando sem calculos")
    } else {
        do {
            qtNumeros++
            somaNumeros += numero

            if (numero > maiorNumero) maiorNumero = numero
            if (numero < menorNumero || menorNumero == 0) menorNumero = numero
            if (numero % 2 == 0) {
                qtNumerosPares++
                somaPares += numero
            }

            print("Digite um numero ou zero para finalizar: ")
            numero = readln().toInt()
        } while (numero != 0)

        mediaGeral = somaNumeros / qtNumeros.toDouble()
        mediaPares = somaPares / qtNumerosPares.toDouble()

        println()
        println("Soma dos numeros digitados: $somaNumeros")
        println("Quantidade de numeros digitados: $qtNumeros")
        println("Media dos numeros digitados: $mediaGeral")
        println("Maior numero digitado: $maiorNumero")
        println("Menor numero digitado: $menorNumero")
        println("Media dos numeros pares: $mediaPares")
    }
}