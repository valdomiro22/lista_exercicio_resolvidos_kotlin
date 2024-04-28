package lista02_condicionais

fun main() {
    print("Digite o ano: ")
    val ano = readln().toInt()

    // se divisível por 400 ou se for divisível por 4 e não for divisível por 100
    val anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)

    if (anoBissexto) {
        println("$ano é um ano bissexto")
    } else {
        println("$ano não é um ano bissexto")
    }
}