import java.io.File
import java.util.*
import kotlin.Comparator

class Tema (var nome: String) {
    override fun toString(): String {
        return nome
    }
}

fun main(){
    val input = Scanner(System.`in`)
    val source = File("assets/temastcc.txt")
    val readLines = source.readLines()
    val temas = readLines.map { Tema(it) }
    temas.sortedWith(Comparator { o1, o2 ->
       print("Escolha o preferido entre:\n1- ${o1.nome}\n2- ${o2.nome}\nR: ")

        val i = input.nextInt()
        if(i == 1) 1 else if(i == 2) -1 else 0
    }).forEach { println(it) }


}