package lista03_repeticao

fun main() {
    print("Digite o inicio do intervalo: ")
    val inicio = readln().toInt()
    print("Digite o fin do intervalo: ")
    val fin = readln().toInt()

    var soma = 0
    var produto = 1

    for (i in inicio..fin) {
        if (i % 2 == 0) soma += i
        if (i % 2 != 0) produto *= i
    }

    println()
    println("Soma: $soma")
    println("Produto: $produto")
}