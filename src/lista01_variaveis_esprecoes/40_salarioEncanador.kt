package lista01_variaveis_esprecoes

fun main() {

    val diaria = 30.0

    print("Quantidade de dias trabalhados: ")
    val qtDiasTrabalhados = readln().toDouble()

    val salarioBruto = diaria * qtDiasTrabalhados
    val salarioLiquido = salarioBruto * (1 - 0.08)

    println()
    println("Pagamento bruto: $salarioBruto")
    print("Pagamento liquido: $salarioLiquido")
}