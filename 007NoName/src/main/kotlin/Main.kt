// 7 - Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
// Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário.
fun main() {
    var numero: Float
    var soma = 0.0

    for (i in 1..6) {
        print("Informe o $i º número: ")
        numero = readln().toFloat()

        while (numero < 0 || numero > 10) {
            print("Número inválido. Digite um novo valor: ")
            numero = readln().toFloat()
        }

        if (numero >= 0 && numero <= 10) {
            soma += numero
        }
    }
    var media: Double
    media = soma / 6
    print("Sua média final: $media")
}
