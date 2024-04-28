package lista02_condicionais

fun main() {
    print("Digite o salario atual: ")
    val salarioAtual = readln().toDouble()
    print("Digite o tempo de serviço: ")
    val tempoServico = readln().toInt()

    var reajuste = 0.0
    if (salarioAtual <= 500 && tempoServico < 1) {
        reajuste = salarioAtual * 0.25
    } else if (salarioAtual <= 1000 && tempoServico < 4) {
        reajuste = (salarioAtual * 0.20)
    } else if (salarioAtual <= 1500 && tempoServico < 7) {
        reajuste = (salarioAtual * 0.15)
    } else if (salarioAtual <= 2000 && tempoServico < 11) {
        reajuste = (salarioAtual * 0.20)
    } else {
        reajuste = 0.0
    }

    var bonus = 0
    if (tempoServico < 1) {
        bonus = 0
    } else if (tempoServico <= 3) {
        bonus = 100
    } else if (tempoServico <= 6) {
        bonus = 200
    } else if (tempoServico <= 10) {
        bonus = 300
    } else {
        bonus = 500
    }

    val novoSalario = salarioAtual + reajuste + bonus

    println()
    print("Salario reajustado: $novoSalario")
}