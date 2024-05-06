package lista03_repeticao

fun main() {
    var valor: Int
    var soma = 0

    for (i in 1..10) {
        print("Digite o valor $i/10: ")
        valor = readln().toInt()

        soma += valor
    }

    println("Soma: $soma")
}