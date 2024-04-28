package lista02_condicionais

fun main() {

    val anoAtual = 2008

    print("Digite o dia: ")
    val dia = readln().toInt()
    print("Digite o mes: ")
    val mes = readln().toInt()
    print("Digite o ano: ")
    val ano = readln().toInt()

    val anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)

    if (ano > anoAtual) {
        println("Ano inválido")
    } else {
        if (mes < 1 || mes > 12) {
            println("Este mês não existe")
        } else {
            if (mes == 1 && (dia < 1 || dia > 31)) {
                println("Dia inválido")
            } else if (mes == 2 && (anoBissexto && dia > 29)) {
                println("Dia inválido, ano bissexto")
            } else if (mes == 2 && (!anoBissexto && dia > 28)) {
                println("Dia inválido, ano não bissexto")
            } else if (mes == 3 && (dia < 1 || dia > 32)) {
                println("Dia inválido")
            } else if (mes == 4 && (dia < 1 || dia > 30)) {
                println("Dia inválido")
            } else if (mes == 5 && (dia < 1 || dia > 31)) {
                println("Dia inválido")
            } else if (mes == 6 && (dia < 1 || dia > 30)) {
                println("Dia inválido")
            } else if (mes == 7 && (dia < 1 || dia > 31)) {
                println("Dia inválido")
            } else if (mes == 8 && (dia < 1 || dia > 31)) {
                println("Dia inválido")
            } else if (mes == 9 && (dia < 1 || dia > 30)) {
                println("Dia inválido")
            } else if (mes == 10 && (dia < 1 || dia > 31)) {
                println("Dia inválido")
            } else if (mes == 11 && (dia < 1 || dia > 30)) {
                println("Dia inválido")
            } else if (mes == 12 && (dia < 1 || dia > 31)) {
                println("Dia inválido")
            } else {
                println("$dia/$mes/$ano é uma data válida")
            }
        }
    }
}