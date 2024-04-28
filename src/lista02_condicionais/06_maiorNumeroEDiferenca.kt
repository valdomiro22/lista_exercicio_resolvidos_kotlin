package lista02_condicionais

fun main() {
    print("Primeiro numero: ")
    val n1 = readln().toInt()
    print("Segundo numero: ")
    val n2 = readln().toInt()

    val diferenca: Int
    if (n1 > n2) {
        diferenca = n1 - n2
        println("$n1 é maior do que $n2")
    } else{
        diferenca = n2 - n1
        println("$n2 é maior do que $n1")
    }

    println("Diferenca entre eles é: $diferenca")
}