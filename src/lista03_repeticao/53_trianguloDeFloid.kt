package lista03_repeticao

fun main() {
    print("Digite o valor de N: ")
    val vlN = readln().toInt()

    var aux = 1
    for (i in 0..vlN) {
        for (j in 0..i) {
            print("$aux ")
            aux++
        }
        println()
    }
}