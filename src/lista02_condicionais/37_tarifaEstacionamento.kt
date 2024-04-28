package lista02_condicionais

fun main() {

    var horasPermanencia = 0
    var qtMinutosPermanencia: Int
    var quantidadeHoras = 0
    var valorConta = 0.0

    print("Digite as horas de entrada: ")
    val horaEntrada = readln().toInt()
    print("Digite os minutos de saida: ")
    val minutoEntrada = readln().toInt()
    print("Digite as horas de entrada: ")
    val horaSaida = readln().toInt()
    print("Digite os minutos de saida: ")
    val minutoSaida = readln().toInt()

    qtMinutosPermanencia = minutoSaida - minutoEntrada

    if (qtMinutosPermanencia > 0) {
        quantidadeHoras += 1
        println("Adicionou 1 hora")
    }

    if (horaEntrada > horaSaida) {
        println("Hora inválida")
    } else if (horaSaida > horaEntrada) {
        horasPermanencia = horaSaida - horaEntrada
        quantidadeHoras += horasPermanencia

        valorConta = if (quantidadeHoras <= 2) {
            quantidadeHoras * 1.0
        } else if (quantidadeHoras <= 4) {
            quantidadeHoras * 1.4
        } else {
            quantidadeHoras * 2.0
        }

        println()
        println("Horas de permanencia: $quantidadeHoras")
        println("Valor a pagar: $valorConta")
    }
}