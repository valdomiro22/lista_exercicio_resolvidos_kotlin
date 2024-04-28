package lista02_condicionais

fun main() {
    print("Digite a altura: ")
    val altura = readln().toFloat()
    print("Digite o peso: ")
    val peso = readln().toFloat()

    if (altura < 1.2 && peso <= 60) {
        println("A")
    } else if (altura < 1.2 && peso <= 90) {
        println("D")
    } else if (altura < 1.2 && peso > 90) {
        println("G")
    } else if (altura <= 1.7 && peso <= 60) {
        println("B")
    } else if (altura <= 1.7 && peso <= 90) {
        println("E")
    } else if (altura <=  1.7 && peso > 90) {
        println("H")
    } else if (altura > 1.7 && peso <= 60) {
        println("C")
    } else if (altura > 1.7 && peso <= 90) {
        println("F")
    } else if (altura >  1.7 && peso > 90) {
        println("I")
    }
}