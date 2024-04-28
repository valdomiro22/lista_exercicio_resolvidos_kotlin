package lista02_condicionais

fun main() {
    print("Digite a idade do nadador: ")
    val idade = readln().toInt()

    if (idade in 5..7) {
        println("Infantil A")
    } else if (idade in 8..10) {
        println("Infantil B")
    } else if (idade in 11..13) {
        println("Juvenil A")
    } else if (idade in 14..17) {
        println("Juvenil B")
    } else if (idade > 18) {
        println("Sênior")
    }
}