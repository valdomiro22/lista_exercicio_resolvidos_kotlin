package lista03_repeticao

fun main() {
    var somaImpares = 0

    print("Digite o valor inicial: ")
    val inicio = readln().toInt()
    print("Digite o valor final: ")
    val final = readln().toInt()

    while (inicio >= final) {
        println("Intervalo de valores invalido")
    }

    for (i in inicio..final) {
        if (i % 2 != 0) somaImpares += i
    }

    println("Soma dos impares: $somaImpares")
}