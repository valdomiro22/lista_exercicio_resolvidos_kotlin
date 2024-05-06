package lista03_repeticao

fun main() {
    println("Escolha uma opção: ")
    println("[1] - km/h para m/s")
    println("[2] - m/s para km/h")
    println("[0] - Finalizar")
    print("Opção: ")
    var opcao = readln().toInt()

    while (opcao < 0 || opcao > 2) {
        println("\nOpção inválida!\n".uppercase())

        println("Escolha uma opção: ")
        println("[1] - km/h para m/s")
        println("[2] - m/s para km/h")
        println("[0] - Finalizar")
        print("Opção: ")
        opcao = readln().toInt()
    }

    if (opcao == 0) {
        println("Finalizando sem calculos")
    } else {
        do {
            print("Digite a velodicade: ")
            val velocidade = readln().toFloat()

            if (opcao == 1) {
                val ms = velocidade * 3.6
                println("Em m/s: $ms")
            } else {
                val kmh = velocidade / 3.6
                println("Em m/s: $kmh")
            }

            println()
            println("Escolha uma opção: ")
            println("[1] - km/h para m/s")
            println("[2] - m/s para km/h")
            println("[0] - Finalizar")
            print("Opção: ")
            opcao = readln().toInt()
        } while (opcao != 0)

        println("\nFINALIZANDO")
    }
}