package lista03_repeticao

fun main() {
    var salarioInicial = 2000.0
    var aumento = 0.15
    salarioInicial *= (1 + aumento)

    for (i in 1997..2000) {
        aumento *= 2
        salarioInicial *= (1 + aumento)
    }

    println(salarioInicial)
}