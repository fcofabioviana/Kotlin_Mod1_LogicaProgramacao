private const val ADDITEM = "1"
private const val EDITARITEM = "2"
private const val EXIBIRITENS = "3"
private const val EXIBIRTODOS = "4"
private const val FECHAR = "0"

val menuPrincipal = """
    Digite a opção desejada no Menu:
    1..............ADICIONAR ITEM
    2..............EDITAR ITEM
    3..............EXIBIR ITENS EM ESTOQUE
    4..............EXIBIR TODOS OS ITENS
    0......FECHAR SISTEMA
""".trimIndent()

val itensEstoque: MutableList<String> = mutableListOf()
var idItem = 1
var produto = ""

fun main (){
    controleEstoque()
}

fun controleEstoque() {
    println("Bem-vindo à oficina!")
    do {
        println(menuPrincipal)

        val menu = readln()

        when (menu) {
            ADDITEM -> {
                println("Digite o produto a ser adicionado:")
                produto = readln()
                println("Digite a quantidade do produto que está sendo adicionado:")
                qtdeProduto = readln().toInt()
                idItem++

            }
            EDITARITEM -> {
                if (itensEstoque.isEmpty()){
                    println("Não há itens no estoque.")
                } else {
                    println("Informe o código do item a ser modificado:")
                    val codItem = readln().toInt()
                    println("Você está alterando o item de código: #0$codItem." +
                            "\nDigite 1 para alterar apenas o nome do produto." +
                            "\nDigite 2 para alterar apenas a quantidade do produto." +
                            "\nDigite 3 para alterar ambos os valores.")
                    val alteraProduto = readln()
                    when (alteraProduto){
                        "1" -> {
                            println("Informe o novo nome para o produto de código #0$codItem:")
                        }
                        "2" -> {
                            println("Informe a nova quantidade para o produto de código #0$codItem:")
                        }
                        "3" -> {
                            println("Informe o novo nome para o produto de código #0$codItem:")
                        }
                    }
                }
            }
//            EXIBIRITENS -> {
//                println("Item será exibido")
//            }
            EXIBIRTODOS -> {
                if (itensEstoque.isEmpty()){
                    println("Não há itens no estoque.")
                } else {
                    println("ID|Item|Quantidade")
                    itensEstoque.forEach {
                        println(it)
                    }
                }
            }
            else -> {
                Unit
            }
        }
    } while (menu != FECHAR)
}