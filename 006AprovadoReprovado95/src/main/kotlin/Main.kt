fun main() {
    var nota1: Double
    var nota2: Double
    var media: Double
    var aprovado = 0
    var resposta = "S"

    while (resposta == "S") {
        print("Digite a primeira nota: ")
        nota1 = readln().toDouble()
        print("Digite a segunda nota: ")
        nota2 = readln().toDouble()

        media = (nota1 + nota2) / 2.0

        println("Sua média final: $media.")

        if (media >= 9.5) {
            println("Aluno aprovado!")
            aprovado++
        } else {
            println("Que pena, aluno reprovado!")
        }
        print("Calcular a média de outro aluno? (S/N): ")
        resposta = readln().uppercase()
    }
    print("Quantidade de alunos aprovados: $aprovado.")
}