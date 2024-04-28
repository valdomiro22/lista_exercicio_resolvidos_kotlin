package lista02_condicionais

fun main() {
    print("Digite um numero: ")
    val n1 = readln().toInt()
    print("Digite outro numero: ")
    val n2 = readln().toInt()

    println("Escolha uma opção")
    println("[1] - Soma")
    println("[2] - Diferença")
    println("[3] - Produto")
    println("[4] - Divisão")
    print("Opção: ")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> {
            val operacao = n1 + n2
            println("Soma: $operacao")
        }
        2 -> {
            val operacao = n1 - n2
            println("Soma: $operacao")
        }
        3 -> {
            val operacao = n1 * n2
            println("Soma: $operacao")
        }
        4 -> {
            val operacao = n1 / n2.toDouble()
            println("Soma: $operacao")}
        else -> {
            println("Opão inválida")
        }
    }
}