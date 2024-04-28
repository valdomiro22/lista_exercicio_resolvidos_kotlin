package lista02_condicionais

fun main() {
    print("Digite o valor da venda: ")
    val valorVenda = readln().toDouble()

    val comicao: Double  = if (valorVenda < 20_000) {
        400 + (valorVenda * 0.14)
    } else if (valorVenda < 40_000) {
        500 + (valorVenda * 0.14)
    } else if (valorVenda < 60_000) {
        550 + (valorVenda * 0.14)
    } else if (valorVenda < 80_000) {
        600 + (valorVenda * 0.14)
    } else if (valorVenda < 100_000) {
        650 + (valorVenda * 0.14)
    } else {
        700 + (valorVenda * 0.16)
    }

    println("Valor da comissão: ${String.format("%.2f", comicao)}")
}