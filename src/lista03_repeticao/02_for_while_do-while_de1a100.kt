package lista03_repeticao

fun main() {
    print("for: ")
    for (i in 1..100) print("$i ")

    println()
    print("while: ")
    var cont = 1
    while (cont <= 100) {
        print("$cont ")
        cont++
    }

    println()
    print("do while: ")
    var cont2 = 1
    do {
        print("$cont2 ")
        cont2++
    } while (cont2 <= 100)
}