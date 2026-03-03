fun main() {
    val num1: Float
    var num2: Float

    print("Digite o primeiro número: ")
    num1 = readln().toFloat()
    print("Digite o segundo número: ")
    num2 = readln().toFloat()

    while (num2 <= 0) {
        println("Opa! Deu um erro brabo aqui. O segundo número deve ser maior que zero. Tente novamente.")
        num2 = readln().toFloat()
    }

    var resultado: Float = num1 / num2
    println("O resultado da divisão é: $resultado")
}