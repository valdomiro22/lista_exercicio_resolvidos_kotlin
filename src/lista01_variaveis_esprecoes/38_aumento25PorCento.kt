package lista01_variaveis_esprecoes

fun main() {
    print("Salario ")
    val salario = readln().toDouble()

    val salarioConAumento = salario * (1 + 0.25)

    println()
    print("Salario com aumento: $salarioConAumento")
}