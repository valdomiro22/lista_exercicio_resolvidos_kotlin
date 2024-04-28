package lista02_condicionais

fun main() {
    print("Valor A: ")
    val vlA = readln().toInt()
    print("Valor B: ")
    val vlB = readln().toInt()
    print("Valor C: ")
    val vlC = readln().toInt()

    if (vlA < (vlB + vlC) && vlB < (vlA + vlC) && vlC < (vlA + vlB)) {
        print("Triangulo ")

        if (vlA == vlB && vlA == vlC) {
            println("equilatero")
        } else if (vlA == vlB || vlA == vlC || vlB == vlC) {
            println("isosceles")
        } else {
            println("escaleno")
        }
    } else {
        println("Não é um triangulo")
    }
}