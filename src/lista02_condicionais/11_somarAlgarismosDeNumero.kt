package lista02_condicionais

fun main() {
    print("Digite um numero: ")
    var numero = readln().toInt()

    var somaDigitos = -1
    if (numero <= 0) {
        println("Número inválido")
    } else if (numero < 10) {
        somaDigitos = numero
        println("Soma: $somaDigitos")
    } else if (numero < 100) {
        val dig2 = numero % 10
        numero /= 10
        somaDigitos = dig2 + numero
        println("Soma: ($numero + $dig2) = $somaDigitos")
    } else if (numero < 1000) {
        val dig3 = numero % 10
        numero /= 10
        val dig2 = numero % 10
        numero /= 10
        somaDigitos = numero + dig2 + dig3
        println("Soma: ($numero + $dig2 + $dig3) = $somaDigitos")
    } else if (numero < 10000) {
        val dig4 = numero % 10
        numero /= 10
        val dig3 = numero % 10
        numero /= 10
        val dig2 = numero % 10
        numero /= 10
        somaDigitos = numero + dig2 + dig3 + dig4
        println("Soma: ($numero + $dig2 + $dig3 + $dig4) = $somaDigitos")
    } else if (numero < 100000) {
        val dig5 = numero % 10
        numero /= 10
        val dig4 = numero % 10
        numero /= 10
        val dig3 = numero % 10
        numero /= 10
        val dig2 = numero % 10
        numero /= 10
        somaDigitos = numero + dig2 + dig3 + dig4 + dig5
        println("Soma: ($numero + $dig2 + $dig3 + $dig4 + $dig5) = $somaDigitos")
    } else {
        println("Tente um numero menor do que 100 000")
    }
}