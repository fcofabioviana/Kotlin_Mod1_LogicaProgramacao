/*
Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores,
peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato e qual a
porcentagem de votos de cada um.

Candidato A - 300 votos (30%)
Candidato B - 200 votos (20%)
Candidato C - 500 votos (50%)
 */
fun main(){
    var canditadoA = 0
    var canditadoB = 0
    var canditadoC = 0
    var totalVotos = 0
    var numEleitores = 0
    var voto = ""
    do {
        println("Qual o número de eleitores?")
        numEleitores = readln().toInt()
        if (numEleitores <= 0) println("ATENÇÃO! Informe um número maior que zero.")
    } while (numEleitores <= 0)
    for (i in 1..numEleitores){
        do {
            println("Qual o seu voto eleitor número $i de $numEleitores? [A/B/C]")
            voto = readln().uppercase()
            when (voto) {
                "A" -> canditadoA++
                "B" -> canditadoB++
                "C" -> canditadoC++
                else -> println("ATENÇÃO! Informe um candidato válido (A, B ou C).")
            }
        } while (voto != "A" && voto != "B" && voto != "C")
        totalVotos++
    }
    println("Candidato A - $canditadoA voto(s) (${(canditadoA*100)/totalVotos}%).")
    println("Candidato B - $canditadoB voto(s) (${(canditadoB*100)/totalVotos}%).")
    println("Candidato C - $canditadoC voto(s) (${(canditadoC*100)/totalVotos}%).")
    println("Total geral de votos: $totalVotos")
}