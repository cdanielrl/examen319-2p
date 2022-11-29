import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object CompararLista {    
    def compara[A](lista1:List[A], lista2:List[A]):Boolean = {
        lista2.forall(lista1.contains)
    }  

    def main(args: Array[String]) = {
        println ("Ingrese los elementos de la primera lista, termine con una linea vacia.")
        var x = false
        val lista1 = ListBuffer[String]()
        while (!x) {
            val input = scala.io.StdIn.readLine(":").stripLineEnd
            lista1 += input
            if (input == ""){ x = true}
        }
        println ("Ingrese los elementos de la segunda lista, termine con una linea vacia.")
        x = false
        val lista2 = ListBuffer[String]()
        while (!x) {
            val input = scala.io.StdIn.readLine(":").stripLineEnd
            lista2 += input
            if (input == ""){ x = true}
        }
        if(compara(lista1.toList,lista2.toList)) {
            println ("Es subconjunto.")
        } else {
            println ("NO es subconjunto.")
        }
    }
}