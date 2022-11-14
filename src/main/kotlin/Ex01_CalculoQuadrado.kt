//    EXERCICIO 1 - AULA 07/11
/* Faça um algoritimo que receba o comprimento do lado de um quadrado e calcule sua área e seu perímetro.
Exemplo:
Digite o lado do quadrado:
12
A area do quadrado e de 144 e seu perimetro de 48.
 */
fun main(){
    println("Digite o valor do lado do quadrado:")
    val lado: Int = readln().toInt()
//    val perimetro: Int = 4 * lado
    val perimetro: Int = lado.times(4) //outra forma de fazer (função times)
//    val area: Int = lado * lado
    val area: Int = lado.times(lado) //outra forma de fazer (função times)
    println("A área do quadrado é $area e seu perímetro é $perimetro.")
}