package lista03_repeticao

fun main() {
    print("Digite o valor de R1 ou 0 para finalizar: ")
    var r1 = readln().toDouble()

    if (r1 == 0.0) {
        print("Finalizando sem calculos")
    } else {
        print("Digite o valor de R2 ou 0 para finalizar: ")
        var r2 = readln().toDouble()

        if (r2 == 0.0) {
            print("Finalizando sem calculos")
        } else {
            do {
                val req = (r1 * r2) / (r1 + r2)
                println("Req = $req")

                print("Digite o valor de R1 ou 0 para finalizar: ")
                r1 = readln().toDouble()
                print("Digite o valor de R2 ou 0 para finalizar: ")
                r2 = readln().toDouble()
            } while (r1 != 0.0 && r2 != 0.0)
        }
    }
}