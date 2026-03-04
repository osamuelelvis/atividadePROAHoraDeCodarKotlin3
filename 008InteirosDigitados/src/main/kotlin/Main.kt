// 8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
// N  é um valor informado pelo usuário
fun main() {
    var numero = 1
    var valor_usuario: Int

    print("Digite um número: ")
    valor_usuario = readln().toInt()

    println("Estes são os valores inteiros de 1 a $valor_usuario: ")
    while (numero <= valor_usuario) {
        print("$numero ")
        numero++
    }
}