fun main() {
    var soma = 0;
    var numero = 15;
    var contador = 0.0;
    while (numero <= 100) {
        soma += numero;
        contador++;
        numero++;
    }
    val resultado = soma / contador;
    print("Média final: $resultado");
}