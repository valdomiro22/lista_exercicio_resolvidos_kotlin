package lista02_condicionais

fun main() {
    print("Digite a nota 1: ")
    val nota1 = readln().toDouble()
    print("Digite a nota 2: ")
    val nota2 = readln().toDouble()
    print("Digite a nota 3: ")
    val nota3 = readln().toDouble()

    val mediaPonderada = (nota1 + nota2 + (nota3 * 2)) / 4

    println("Media: $mediaPonderada")
    if (mediaPonderada > 60) {
        println("Aprovado")
    } else {
        println("Desaprovado")
    }
}