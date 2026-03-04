// 10 - Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.
fun main() {
    var i: Int
    var numero_usuario: Int
    var numeros_dentro = 0
    var numeros_fora = 0

    for (i in 1..10) {
        print("Digite o $i º número: ")
        numero_usuario = readln().toInt()

        if (numero_usuario >= 24 && numero_usuario <= 42) {
            numeros_dentro++
        } else {
            numeros_fora++
        }
    }
    print("Números entre 24 e 42: $numeros_dentro\n")
    print("Números fora desse intervalo: $numeros_fora")
}