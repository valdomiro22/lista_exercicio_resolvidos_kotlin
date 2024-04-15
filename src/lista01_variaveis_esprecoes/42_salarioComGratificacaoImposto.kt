package lista01_variaveis_esprecoes

fun main() {
    print("Salario base: ")
    val salarioBase = readln().toDouble()

    val gratificacao = salarioBase * 0.05
    val impostos = salarioBase * 0.07
    val salarioLiquido = salarioBase + gratificacao - impostos

    println()
    println("Gratificação: $gratificacao")
    println("Impostos: $impostos")
    println("Salario liquido: $salarioLiquido")
}