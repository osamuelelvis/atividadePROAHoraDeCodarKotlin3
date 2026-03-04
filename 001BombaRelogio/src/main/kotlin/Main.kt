// 1 - Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".
fun main() {
    println("Uma bomba relógio foi acionada! Ela vai explodir em 30 segundos!")
    for (c in 30 downTo 0) {
        println("Tempo restante: $c segundos")
        Thread.sleep(1000)
    }
    print("EXPLOSÃO! A bomba explodiu!")
}
