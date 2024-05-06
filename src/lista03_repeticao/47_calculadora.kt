package lista03_repeticao

fun main() {
    println("Escolha uma opção")
    println("[1] - Adição")
    println("[2] - Subtração")
    println("[3] - Multiplicação")
    println("[4] - Divião")
    println("[5] - Sair")
    print("Opção: ")
    var opcao = readln().toInt()

    while (opcao < 1 || opcao > 5) {
        println("\nOPÇÃO INVÁLIDA!\n")
        println("Escolha uma opção")
        println("[1] - Adição")
        println("[2] - Subtração")
        println("[3] - Multiplicação")
        println("[4] - Divião")
        println("[5] - Sair")
        print("Opção: ")
        opcao = readln().toInt()
    }

    if (opcao == 5) {
        println("Finalizando sem calculos")
    } else {
        do {
            print("Primeiro numero: ")
            val vl1 = readln().toInt()
            print("Segundo numero: ")
            val vl2 = readln().toInt()

            when (opcao) {
                1 -> {
                    val soma = vl1 + vl2
                    println("$vl1 + $vl2 = $soma")
                }
                2 -> {
                    val diferenca = vl1 - vl2
                    println("$vl1 - $vl2 = $diferenca")
                }
                3 -> {
                    val diferenca = vl1 * vl2
                    println("$vl1 X $vl2 = $diferenca")
                }
                4 -> {
                    val diferenca = vl1 / vl2
                    println("$vl1 / $vl2 = $diferenca")
                }
            }

            println()
            println("Escolha uma opção")
            println("[1] - Adição")
            println("[2] - Subtração")
            println("[3] - Multiplicação")
            println("[4] - Divião")
            println("[5] - Sair")
            print("Opção: ")
            opcao = readln().toInt()

            while (opcao < 1 || opcao > 5) {
                println("\nOPÇÃO INVÁLIDA!\n")
                println("Escolha uma opção")
                println("[1] - Adição")
                println("[2] - Subtração")
                println("[3] - Multiplicação")
                println("[4] - Divião")
                println("[5] - Sair")
                print("Opção: ")
                opcao = readln().toInt()
            }
        } while (opcao != 5)
    }
}