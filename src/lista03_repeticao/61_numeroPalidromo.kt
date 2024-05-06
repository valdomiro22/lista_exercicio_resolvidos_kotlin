package lista03_repeticao

fun main() {
    var multi: Int
    var p1: Int
    var p2: Int
    var maior = 0

    for (i in 1000..999999) {
        p2 = i % 100
        p1 = i / 100

        multi = p1 * p2
        if (multi == multi.toString().reversed().toInt()) {
            if (multi > maior) maior = multi
        }
    }
    println("Maior: $maior")
}