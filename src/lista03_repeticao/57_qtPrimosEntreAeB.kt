package lista03_repeticao

fun main() {
    print("Digite o valor de A: ")
    val vla = readln().toInt()
    print("Digite o valor de B: ")
    val vlb = readln().toInt()

    var qtPrimos = 0

    var qtDivisores: Int
    for (i in vla..vlb) {

        qtDivisores = 0

        for (j in 1..i) {
            if (i % j == 0) {
                qtDivisores++
            }
        }

        if (qtDivisores == 2) {
            qtPrimos++
        }
    }

    println()
    println("Quantidade de numeros primos no intervalo: $qtPrimos")

}