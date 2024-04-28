package lista02_condicionais

fun main() {
    print("Digite um numero: ")
    val num1 = readln().toInt()
    print("Digite outro numero: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("$num1 é o maior numero")
    } else if (num2 > num1) {
        println("$num2 é o maior numero")
    } else {
        println("Os dois numeros são iguais")
    }
}