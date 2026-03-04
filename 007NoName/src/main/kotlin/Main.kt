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