package lista02_condicionais

fun main() {
    print("Idade: ")
    val idade = readln().toInt()
    print("Tempo de serviço: ")
    val tempoServico = readln().toInt()

    if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
        println("Pode se aposentar")
    } else {
        println("Não pode se aposentar")
    }
}