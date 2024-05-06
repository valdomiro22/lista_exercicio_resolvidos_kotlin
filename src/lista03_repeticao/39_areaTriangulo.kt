package lista03_repeticao

fun main() {
    var base: Double
    var altura: Double

    print("Digite o valor da base: ")
    base = readln().toDouble()
    while (base <= 0) {
        print("Digite o valor da base: ")
        base = readln().toDouble()
    }

    print("Digite o valor da autura: ")
    altura = readln().toDouble()

    while (altura <= 0) {
        print("Digite o valor da autura: ")
        altura = readln().toDouble()
    }

    val area = base * (altura / 2)

    println("Area: $area")
}