package lista02_condicionais

fun main() {
    print("Digite o valor do produto: ")
    val valorProduto = readln().toDouble()
    println("Selecione o estado")
    println("[1] - MG")
    println("[2] - SP")
    println("[3] - RJ")
    println("[4] - MS")
    val estado = readln().toInt()

    when (estado) {
        1 -> {
            val porcentagem = valorProduto * 0.07
            val valorFinal = valorProduto + porcentagem
            println("Valor final do produto: $valorFinal")
        }
        2 -> {
            val porcentagem = valorProduto * 0.12
            val valorFinal = valorProduto + porcentagem
            println("Valor final do produto: $valorFinal")
        }
        3 -> {
            val porcentagem = valorProduto * 0.15
            val valorFinal = valorProduto + porcentagem
            println("Valor final do produto: $valorFinal")
        }
        4 -> {
            val porcentagem = valorProduto * 0.08
            val valorFinal = valorProduto + porcentagem
            println("Valor final do produto: $valorFinal")
        }
        else -> println("Estado invalido")
    }
}