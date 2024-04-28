package lista02_condicionais

fun main() {
    print("Distancia em km: ")
    val distancia = readln().toDouble()
    print("Quantidade de litros de gasolina: ")
    val qtLitros = readln().toDouble()

    val consumo = distancia / qtLitros

    if (consumo < 8) {
        println("Venda o carro!")
    } else if (consumo < 13) {
        println("Economico!")
    } else {
        println("Super econômico!")
    }
}