package lista02_condicionais

fun main() {
    print("Preço antigo: ")
    val precoAntigo = readln().toFloat()

    val precoNovo = if (precoAntigo <= 50) {
        precoAntigo * (1 + 0.05)
    } else if (precoAntigo <= 100) {
        precoAntigo * (1 + 0.1)
    } else {
        precoAntigo * (1 + 0.15)
    }

    println("Preço novo: R$ $precoNovo")
}