// 11 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.
fun main() {
    var numero_usuario: Int
    var i: Int
    var resultado: Int

    print("Digite um número para ver a tabuada desse número: ")
    numero_usuario = readln().toInt()

    for (i in 1..numero_usuario) {
        resultado = numero_usuario * i
        print("$numero_usuario * $i = $resultado\n")
    }
}