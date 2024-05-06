package lista03_repeticao

fun main() {
    var vla = 0
    var vlb = 1
    var vlc = 0

    print("$vla $vlb ")
    while (vlc < 30) {
        vlc = vla + vlb
        vla  = vlb
        vlb = vlc

        print("$vlc ")
    }
}