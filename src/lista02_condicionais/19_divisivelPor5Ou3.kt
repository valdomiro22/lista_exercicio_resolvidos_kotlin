package lista02_condicionais

fun main() {
    print("Digite um numero: ")
    val numero = readln().toInt()

    if (numero % 3 == 0 || numero % 5 == 0) {
        println("É divisivel")
    } else {
        println("Não é divisivel")
    }
}