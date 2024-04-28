package lista02_condicionais

fun main() {
    print("Digite um numero inteiro: ")
    val numero = readln().toInt()

    if (numero % 2 == 0) {
        println("$numero é par")
    } else {
        println("$numero é impar")
    }
}