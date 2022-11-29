import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer

object Primos {
    def primesIterative(end: Int): List[Int] = {
        val primeIndices = ArrayBuffer.fill((end + 1) / 2)(1)
        val intSqrt = Math.sqrt(end).toInt
        for (i <- 3 to end by 2 if i <= intSqrt) {
            for (nonPrime <- i * i to end by 2 * i) {
                primeIndices.update(nonPrime / 2, 0)
            }
        }
        (ArrayBuffer(1,2) ++ (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail).toList
    }
    def main(args: Array[String]) = {
        println ("¿Limite?: ")
        val x = scala.io.StdIn.readInt()
        for(element<-primesIterative(x)) 
        { 
            println(element) 
        } 
    }
}