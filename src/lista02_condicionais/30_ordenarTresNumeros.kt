package lista02_condicionais

fun main() {
    print("Digite um numero: ")
    val num1 = readln().toInt()
    print("Digite um numero: ")
    val num2 = readln().toInt()
    print("Digite um numero: ")
    val num3 = readln().toInt()

    if (num1 > num2 && num1 > num3 && num2 > num3) {
        println("$num1 $num2 $num3")
    } else if (num1 > num2 && num1 > num3 && num2 < num3) {
        println("$num1 $num3 $num2")
    } else if (num2 > num1 && num2 > num3 && num1 > num3) {
        println("$num2 $num1 $num3")
    } else if (num2 > num1 && num2 > num3 && num1 < num3) {
        println("$num2 $num3 $num1")
    } else if (num3 > num2 && num3 > num1 && num2 > num1) {
        println("$num3 $num2 $num1")
    } else if (num3 > num2 && num3 > num1 && num2 < num1) {
        println("$num3 $num1 $num2")
    }
}