package lista02_condicionais

fun main() {
    print("Digite a nota do aluno: ")
    val nota = readln().toDouble()
    print("Digite a quantidade de faltas: ")
    val qtFaltas = readln().toInt()

    if (nota < 4.0 && qtFaltas <= 20) {
        println("E")
    } else if (nota < 4) {
        println("E")
    } else if (nota < 5 && qtFaltas <= 20) {
        println("D")
    } else if (nota < 5) {
        println("E")
    } else if (nota < 7.5 && qtFaltas <= 20) {
        println("C")
    } else if (nota < 7.5) {
        println("D")
    } else if (nota < 9 && qtFaltas <= 20) {
        println("B")
    } else if (nota < 9) {
        println("C")
    } else if (nota < 10.0 && qtFaltas <= 20) {
        println("A")
    } else if (nota < 10) {
        println("B")
    } else {
        println("Nota invlálida")
    }
}