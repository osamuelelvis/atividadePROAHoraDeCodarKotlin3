// 2 - Escreva um algoritmo para ler 2 valores informados pelo usuário e enquanto o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo valor, mas para a mesma variável. Ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. 
// O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.
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
