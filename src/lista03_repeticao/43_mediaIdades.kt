package lista03_repeticao

fun main() {
    var somaIdades = 0
    var qtIdades = 0

    print("Digite uma idade, ou zero para finalizar: ")
    var idade = readln().toInt()

    if (idade == 0) {
        println("Finalizando sem calculos")
    } else {
        do {
            qtIdades++
            somaIdades += idade

            print("Digite uma idade, ou zero para finalizar: ")
            idade = readln().toInt()
        } while (idade != 0)

        val media = somaIdades / qtIdades

        println()
        println("Media de idades: $media")
    }
}