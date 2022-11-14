//    EXERCICIO 2 - AULA 07/11
/* Faça um algoritimo que leia a base e a altura de um triangulo e calcule a sua area.
F => base*altura/2
 */
fun main(){
    println("Digite o valor da base do triângulo:")
    val base: Float = readln().toFloat()
    println("Digite o valor da altura do triângulo:")
    val altura: Float = readln().toFloat()
//    val area: Float = (base * altura)/2
    val area: Float = base.times(altura).div(2) //outra forma de fazer (times)
    println("A área do triângulo é $area.")
}