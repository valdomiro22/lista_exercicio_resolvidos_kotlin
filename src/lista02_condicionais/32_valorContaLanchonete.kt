package lista02_condicionais

fun main() {
    print("Digite o codigo: ")
    val codigo = readln().toInt()
    print("Digite a quantidade: ")
    val quantidade = readln().toInt()

    when (codigo) {
        100 -> {
            val conta = quantidade * 1.2
            println("Valor da conta: R$ $conta")
        }
        101 -> {
            val conta = quantidade * 1.3
            println("Valor da conta: R$ $conta")
        }
        102 -> {
            val conta = quantidade * 1.5
            println("Valor da conta: R$ $conta")
        }
        103 -> {
            val conta = quantidade * 1.2
            println("Valor da conta: R$ $conta")
        }
        104 -> {
            val conta = quantidade * 1.7
            println("Valor da conta: R$ $conta")
        }
        105 -> {
            val conta = quantidade * 2.2
            println("Valor da conta: R$ $conta")
        }
        106 -> {
            val conta = quantidade * 1.0
            println("Valor da conta: R$ $conta")
        }
        else -> println("Código inválido")
    }
}