private const val PAES = 1
private const val SALGADOS = 2
private const val DOCES = 3

private const val LINHA = ".........."

fun main() {

    val valorPaoFrances = 0.60
    val valorPaoDeLeite = 0.40
    val valorPaoDeMilho = 0.50

    val produtoPaoFrances = "Pão Francês"
    val produtoPaoDeLeite = "Pão de Leite"
    val produtoPaoDeMilho = "Pão de Milho"

    val valorCoxinha = 5.00
    val valorEsfiha = 6.00
    val valorPaoDeQueijo = 3.00

    val produtoCoxinha = "Coxinha"
    val produtoEsfiha = "Esfiha"
    val produtoPaoDeQueijo = "Pão de Queijo"

    val valorCarolina = 1.50
    val valorPudim = 4.00
    val valorBrigadeiro = 2.00

    val produtoCarolina = "Carolina"
    val produtoPudim = "Pudim"
    val produtoBrigadeiro = "Brigadeiro"



    val menuPaes = """
        1 - $produtoPaoFrances...........R$ $valorPaoFrances
        2 - $produtoPaoDeLeite..........R$ $valorPaoDeLeite
        3 - $produtoPaoDeMilho..........R$ $valorPaoDeMilho
        0 - Voltar
    """.trimIndent()


    val menuSalgados = """
        1 - $produtoCoxinha...........R$ $valorCoxinha
        2 - $produtoEsfiha..........R$ $valorEsfiha
        3 - $produtoPaoDeQueijo..........R$ $valorPaoDeQueijo
        0 - Voltar
    """.trimIndent()

    val menuDoces = """
        1 - $produtoCarolina...........R$ $valorCarolina
        2 - $produtoPudim..........R$ $valorPudim
        3 - $produtoBrigadeiro..........R$ $valorBrigadeiro
        0 - Voltar
    """.trimIndent()

    val itensComanda = mutableListOf<String>()
    var total: Double = 0.00
    var categoria: Int
    var finalizarCompra = "S"
    var desconto = 0.00



    println("Bem Vindo à padaria E-Padoca!")
    do {

        println(
            "Digite a opção desejada no Menu:\n" + "1..................Pães\n" + "2..............Salgados\n" + "3.................Doces\n" + "0......Finalizar compra"
        )

        categoria = readln().toInt()

        when (categoria) {
            PAES -> {
                do {
                    println(menuPaes)
                    val paoSelecionado = readln().toInt()

                    when (paoSelecionado) {
                        1 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoFrances
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoFrances$LINHA$quantidade${LINHA}R$$valorPaoFrances${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }

                        2 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoDeLeite
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoDeLeite$LINHA$quantidade${LINHA}R$$valorPaoDeLeite${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }

                        3 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoDeMilho
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoDeMilho$LINHA$quantidade${LINHA}R$$valorPaoDeMilho${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }
                        else -> Unit
                    }
                } while (paoSelecionado != 0)
            }

            SALGADOS -> {
                do {
                    println(menuSalgados)
                    val salgadoSelecionado = readln().toInt()

                    when (salgadoSelecionado) {
                        1 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorCoxinha
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoCoxinha$LINHA$quantidade${LINHA}R$$valorCoxinha${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }

                        2 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorEsfiha
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoEsfiha$LINHA$quantidade${LINHA}R$$valorEsfiha${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }

                        3 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPaoDeQueijo
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPaoDeQueijo$LINHA$quantidade${LINHA}R$$valorPaoDeQueijo${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }
                        else -> Unit
                    }
                } while (salgadoSelecionado != 0)
            }

            DOCES -> {
                do {
                    println(menuDoces)
                    val doceSelecionado = readln().toInt()

                    when (doceSelecionado) {
                        1 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorCarolina
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoCarolina$LINHA$quantidade${LINHA}R$$valorCarolina${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }

                        2 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorPudim
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoPudim$LINHA$quantidade${LINHA}R$$valorPudim${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }

                        3 -> {
                            println("Digite a quantidade:")
                            val quantidade = readln().toInt()
                            val totalItem = quantidade * valorBrigadeiro
                            val item =
                                "${itensComanda.size.inc()}$LINHA$produtoBrigadeiro$LINHA$quantidade${LINHA}R$$valorBrigadeiro${LINHA}R$$totalItem"
                            itensComanda.add(item)
                            total += totalItem
                        }
                        else -> Unit
                    }
                } while (doceSelecionado != 0)

            }
            else -> Unit
        }
    } while (categoria != 0)
    do {
        if (itensComanda.isEmpty()){
            println("Deseja finalizar a compra sem itens? (S/N)")
            finalizarCompra = readln().uppercase()
        } else {
            println("======================= COMANDA E-Padoca =======================")
            println("----------------------------------------------------------------")
            println("Item${LINHA}Produto${LINHA}Qtd${LINHA}Valor${LINHA}Total")

            itensComanda.forEach { item ->
                println(item)
            }
        }
        println("Total ================================================> R$$total")
        println("======================= VOLTE SEMPRE ^-^ =======================")
    } while (finalizarCompra != "S")
}
