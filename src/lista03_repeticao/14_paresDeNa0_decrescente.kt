package lista03_repeticao

fun main() {
    print("Digite o valor de N (limite): ")
    val vln = readln().toInt()

    for (i in vln downTo 0) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}