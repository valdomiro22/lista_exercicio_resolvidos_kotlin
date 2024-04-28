package lista02_condicionais

fun main() {
    print("Digite um numero correspondente a um dia do mês: ")
    val diaMes = readln().toInt()

    when (diaMes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abríl")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Mês inválido")
    }
}