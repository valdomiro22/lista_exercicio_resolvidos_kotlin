package lista03_repeticao

fun main() {
    var qtNotas = 0
    var somaNotas = 0
    var nota: Int

    print("Digite uma nota entre 10 e 20: ")
    nota = readln().toInt()
    if (nota !in 10..20) {
        println("Finalizando sem calculos")
    } else {
        do {
            qtNotas++
            somaNotas += nota

            print("Digite uma nota entre 10 e 20: ")
            nota = readln().toInt()
        } while (nota in 10..20)

        val media = somaNotas / qtNotas
        println()
        print("Media: $media")
    }
}