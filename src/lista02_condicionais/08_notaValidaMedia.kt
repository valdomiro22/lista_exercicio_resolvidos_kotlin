package lista02_condicionais

fun main() {
    print("Primeira nota: ")
    val nota1 = readln().toFloat()

    if (nota1 < 0.0 || nota1 > 10.0) {
        println("Nota inválida.")
    } else {
        print("Segunda nota: ")
        val nota2 = readln().toFloat()

        if (nota2 < 0.0 || nota2 > 10.0) {
            print("Segunda nota: ")
        } else {
            val media = (nota1 + nota2) / 2
            println()
            print("Media: $media")
        }
    }
}