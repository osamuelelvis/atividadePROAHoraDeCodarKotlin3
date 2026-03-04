// 5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
fun main() {
    var num1: Int;
    var num2: Int;
    var soma = 0;
    var contador = 0;

    print("Digite o primeiro número: ");
    num1 = readln().toInt();
    var atual = num1;
    print("Digite o segundo número (precisa ser menor que o primeiro): ");
    num2 = readln().toInt();

    while (atual <= num2) {
        soma += atual;
        contador++;
        atual++;
    }

    var resultado = soma / contador;
    print("Média final: $resultado");
}
