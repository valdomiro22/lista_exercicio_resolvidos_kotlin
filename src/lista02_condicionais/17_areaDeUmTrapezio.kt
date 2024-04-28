package lista02_condicionais

fun main() {
    print("Digite a altura: ")
    val altura = readln().toDouble()
    print("Base maior: ")
    val baseMaior = readln().toDouble()
    if (baseMaior <= 0) {
        println("Valor invalido")
    } else {
        print("Base menor: ")
        val baseMenor = readln().toDouble()
        if (baseMenor <= 0) {
            println("Valor invalido")
        } else {
            val area = ((baseMaior + baseMenor) * altura) / 2
            println("Area do trapezio: $area")
        }
    }
}