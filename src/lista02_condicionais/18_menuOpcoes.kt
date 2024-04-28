package lista02_condicionais

fun main() {

    val opcoes = arrayOf("Bom dia", "Olá", "Como vai", "Prazer em conhece-lo")

    println("Escolha uma das opões")
    println("[1] - Bom dia")
    println("[2] - Olá")
    println("[3] - Como vai")
    println("[4] - Prazer em conhece-lo")
    print("Opção: ")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> println(opcoes[0])
        2 -> println(opcoes[1])
        3 -> println(opcoes[2])
        4 -> println(opcoes[3])
        else -> println("Opcão inválida")
    }
}