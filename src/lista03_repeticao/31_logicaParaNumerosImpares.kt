package lista03_repeticao

fun main() {
    var vlS = 0.0

    for (i in 0..49) {
        vlS += ((i * 2) + 1) / (i + 1).toDouble()

        println("${(i * 2) + 1} / ${i+1} = $vlS")
    }
}