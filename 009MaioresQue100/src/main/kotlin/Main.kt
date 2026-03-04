// 9 - Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.
fun main() {
    var numero = 101

    println("Os 10 primeiros números inteiros maiores que 100 são:")
    for (i in 1..10) {
        println(numero)
        numero++
    }
}