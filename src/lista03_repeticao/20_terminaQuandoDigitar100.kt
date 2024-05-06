package lista03_repeticao

fun main() {
    var qtPares = 0
    var qtNumerosLidos = 0

    print("Digite um numero ou 100 para finalizar: ")
    var numero = readln().toInt()
    if (numero == 100) {
        println("Finalizando sem calculos")
    } else {
        do {
            qtNumerosLidos++

            if (numero % 2 == 0) qtPares++

            print("Digite um numero ou 100 para finalizar: ")
            numero = readln().toInt()
        } while (numero != 100)

        println()
        println("Quantidade de numeros lidos: $qtNumerosLidos")
        println("Quantidade de numeros pares: $qtPares")
    }
}