package lista02_condicionais

fun main() {
    print("Digite o custo de fabrica: ")
    val custoFabrica = readln().toDouble()

    var porcentagemDistribuidor = 0.0
    var porcentagemImpostos = 0.0
    if (custoFabrica <= 12_000) {
        porcentagemDistribuidor = custoFabrica * 0.05
    } else if (custoFabrica <= 25_000) {
        porcentagemDistribuidor = custoFabrica * 0.1
        porcentagemImpostos = custoFabrica * 0.15
    } else {
        porcentagemDistribuidor = custoFabrica * 0.15
        porcentagemImpostos = custoFabrica * 0.2
    }

    val custoAoConsumidor = custoFabrica + porcentagemDistribuidor + porcentagemImpostos

    println()
    println("Porcentagem do distribuidor: $porcentagemDistribuidor")
    println("Impostos: $porcentagemImpostos")
    print("Custo ao consumidor: $custoAoConsumidor")
}