package lista03_repeticao

fun main() {
    var somaDivisores = 0

    print("Digite um numero: ")
    val numero = readln().toInt()

    for (i in numero -1 downTo 1) {
        if (numero % i == 0) somaDivisores += i
    }

    println()
    println("Soma dos divisores = $somaDivisores")
}