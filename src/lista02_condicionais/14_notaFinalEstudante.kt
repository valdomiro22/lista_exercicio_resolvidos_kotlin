package lista02_condicionais

fun main() {
    print("Nota do trabalho de laboratório: ")
    val notaTrabalhoLaboratorio = readln().toFloat()
    if (notaTrabalhoLaboratorio < 0 || notaTrabalhoLaboratorio > 10) {
        println("Nota inválida")
    } else {
        print("Nota avaliação semestral: ")
        val notaAvaliacaoSemestral = readln().toFloat()
        if (notaAvaliacaoSemestral < 0 || notaAvaliacaoSemestral > 10) {
            println("Nota inválida")
        } else {
            print("Nota Exame final: ")
            val notaExameFinal = readln().toFloat()
            if (notaExameFinal < 0 || notaExameFinal > 10) {
                println("Nota inválida")
            } else {
                val media = ((notaTrabalhoLaboratorio * 2) + (notaAvaliacaoSemestral * 3) + (notaExameFinal * 5)) / 10
                println("Média: $media")

                if (media < 3) {
                    println("Reprovado")
                } else if (media < 5) {
                    println("Recuperação")
                } else {
                    println("Aprovado")
                }
            }
        }
    }
}