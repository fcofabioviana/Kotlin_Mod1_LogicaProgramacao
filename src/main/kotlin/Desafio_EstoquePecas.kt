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

val itensEstoque = mutableListOf<Triple<Int, String, Int>>()
var idItem = 1

fun main (){
    controleEstoque()
    println("---- Programa Encerrado ----")
}

fun controleEstoque() {
    println("------------------------------")
    println("SISTEMA DE CONTROLE DE ESTOQUE")
    println("------------------------------")
    do {
        println(menuPrincipal)

        val menu = readln()

        when (menu) {
            ADDITEM -> {
                println("Digite o produto a ser adicionado:")
                val produto = readln()
                println("Digite a quantidade do produto que está sendo adicionado:")
                val qtdeProduto = readln().toInt()
                itensEstoque.add(Triple(idItem, produto, qtdeProduto))
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
                            val novoProduto = readln()
                            itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(second = novoProduto)
                        }
                        "2" -> {
                            println("Informe a nova quantidade para o produto de código #0$codItem:")
                            val novaQtde = readln().toInt()
                            itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(third = novaQtde)
                        }
                        "3" -> {
                            println("Informe o novo nome para o produto de código #0$codItem:")
                            val novoProduto = readln()
                            itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(second = novoProduto)
                            println("Informe a nova quantidade para o produto de código #0$codItem:")
                            val novaQtde = readln().toInt()
                            itensEstoque[codItem - 1] = itensEstoque [codItem - 1].copy(third = novaQtde)
                        }
                    }
                }
            }
            EXIBIRITENS -> {
                val semEstoque = itensEstoque.filter { it.third > 0 }
                println("------------------------")
                println("ID | Item | Quantidade")
                println("------------------------")
                semEstoque.forEach {
                    println("#0${it.first} | ${it.second} | ${it.third}")
                }
                println("------------------------\n")
            }
            EXIBIRTODOS -> {
                if (itensEstoque.isEmpty()){
                    println("Não há itens no estoque.")
                } else {
                    println("------------------------")
                    println("ID | Item | Quantidade")
                    println("------------------------")
                    itensEstoque.forEach {
                        println("#0${it.first} | ${it.second} | ${it.third}")
                    }
                    println("------------------------\n")
                }
            }
            else -> {
                Unit
            }
        }
    } while (menu != FECHAR)
}