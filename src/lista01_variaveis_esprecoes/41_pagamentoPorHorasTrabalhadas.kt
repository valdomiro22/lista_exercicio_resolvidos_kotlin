package lista01_variaveis_esprecoes

fun main() {
    print("Valor da hora: ")
    val vlHora = readln().toDouble()
    print("Quantidade de horas trabalhadas no mês: ")
    val qtHoraTrabalhadas = readln().toInt()

    val valorPrimario = vlHora * qtHoraTrabalhadas
    val pagamento = valorPrimario * (1 + 0.1)

    println()
    println("Valor sem aumento: $valorPrimario")
    print("Valor com aumento: $pagamento")
}