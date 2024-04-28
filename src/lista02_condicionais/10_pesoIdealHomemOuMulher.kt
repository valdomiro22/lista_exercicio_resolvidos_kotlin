package lista02_condicionais

fun main() {
    print("Digite a altura: ")
    val altura = readln().toFloat()
    println("Sexo, escolha uma opção")
    println("[1] - Homem")
    println("[2] - Mulher")
    print("Opção: ")
    val sexo = readln().toInt()

    if (sexo == 1) {
        val pesoIdeal = (72.7 * altura) - 58
        println("Peso ideal: $pesoIdeal")
    } else if (sexo == 2) {
        val pesoIdeal = (62.1 * altura) - 44.7
        println("Peso ideal: $pesoIdeal")
    } else {
        println("Sexo inválido")
    }

}