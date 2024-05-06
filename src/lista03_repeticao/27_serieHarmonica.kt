package lista03_repeticao

fun main() {
    print("Digite o valor de N: ")
    val vln = readln().toInt()

    var vlh = 0.0
    for (i in 1..vln) {
        vlh = 1.0 / i

//        print("${1.0 / i}    ")
    }

    println("Valor de H(n): $vlh")
}