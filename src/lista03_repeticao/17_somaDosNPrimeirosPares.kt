package lista03_repeticao

fun main() {
    print("Digite o valor de N: ")
    val vln = readln().toInt()

    var soma = 0
    for (i in 0..vln) {
        soma += i
    }

    println("Soma: $soma")
}