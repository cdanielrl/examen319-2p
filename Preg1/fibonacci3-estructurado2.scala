object Fibonacci {
    
    def fiboelem(n:Int) : Int =  {
        n match
        case 0 => 0
        case 1 => 1
        case 2 => 1
        case _ => fiboelem(n-1) + fiboelem(n-2) + fiboelem(n-3)
    }

    def fibo(n:Int) : Unit  =  {
        var i=0
        for(i <- 0 until n) {
            print (fiboelem(i) + " ")
        }
    }
    def main(args: Array[String]) = {
        println ("¿Cuantos elementos?: ")
        val x = scala.io.StdIn.readInt()
        fibo(x)
    }
} 