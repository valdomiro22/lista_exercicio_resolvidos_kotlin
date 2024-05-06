package lista03_repeticao

fun main() {
    val termos = 5
    var fat: Int
    var serieS = 0.0

    for (i in 0..termos) {
        fat = 1
        for (j in i downTo 1) {
            fat *= j
        }

        serieS += i / fat.toDouble()
        println(serieS)
    }
}