package lista03_repeticao

fun main() {
    var alturaChico = 1.50
    var alturaZe = 1.10

    var qtAnos = 0
    while ( alturaZe < alturaChico) {
        alturaChico += 0.2
        alturaZe += 0.3
        qtAnos++
    }

    println(qtAnos)
}