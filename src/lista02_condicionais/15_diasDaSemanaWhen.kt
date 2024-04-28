package lista02_condicionais

fun main() {
    print("Digite um numero correspondente a um dia da semana: ")
    val diaSemana = readln().toInt()

    when (diaSemana) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sabado")
        else -> println("Dia inválido")
    }
}