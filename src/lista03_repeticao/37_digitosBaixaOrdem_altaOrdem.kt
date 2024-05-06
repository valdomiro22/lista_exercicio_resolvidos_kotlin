package lista03_repeticao

import kotlin.math.pow

fun main() {
    var dig1: Int
    var dig2: Int
    var soma: Double
    var numero: Int
    var ordem: Double

    for (i in 1000..9999) {
        numero = i
        dig1 = numero % 100
        numero /= 100
        dig2 = numero

        soma = (dig1 + dig2).toDouble()
        ordem = soma.pow(2)

        if (ordem == i.toDouble()) {
            println("$dig2 + $dig1 = ${soma.toInt()} --> ${ordem.toInt()}")
        }
    }
}