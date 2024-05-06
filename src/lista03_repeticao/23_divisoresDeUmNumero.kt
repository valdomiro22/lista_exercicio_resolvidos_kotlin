package lista03_repeticao

fun main() {
    print("Digite um numero: ")
    val numero = readln().toInt()

    for (i in numero downTo 1) {
        if (numero % i == 0) {
            println(i)
        }
    }
}