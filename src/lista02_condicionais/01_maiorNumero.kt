package lista02_condicionais

fun main() {
    print("Primeiro numero: ")
    val num1 = readln().toInt()
    print("Segundo numero: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("Primeiro numero é maior")
    } else {
        println("Segundo numero é maior")
    }
}