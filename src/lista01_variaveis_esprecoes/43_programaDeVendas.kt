package lista01_variaveis_esprecoes

fun main() {
    print("Total das vendas: ")
    val totalVendas = readln().toDouble()

    val valorComDesconto10 = totalVendas * (1 - 0.1)
    val valorParcelaSemJuros = totalVendas / 3
    val comicaoCasoVista = valorComDesconto10 * 0.05
    val comicaoCasoParcelado = totalVendas * 0.05

    println()
    println("O total a pagar com desconto de 10%: $valorComDesconto10")
    println("O valor de cada parcela, no parcelamento de 3× sem juros: $valorParcelaSemJuros")
    println("A comissao do vendedor, no caso da venda ser a vista: $comicaoCasoVista")
    println("A comissao do vendedor, no caso da venda ser parcelada: $comicaoCasoParcelado")
}