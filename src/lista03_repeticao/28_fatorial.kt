package lista03_repeticao

fun main() {
    var fat: Int
    var vlE: Double

    print("Fatorial de: ")
    val numero = readln().toInt()

    for (i in 0..numero) {

        fat = 1

        for (j in i downTo 1) {
            fat *= j
        }

        vlE = 1.0 / fat
        println(vlE)
    }
}