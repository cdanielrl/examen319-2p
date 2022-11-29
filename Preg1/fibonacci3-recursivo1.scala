object Fibonacci {
    def fiboelem(n:Int) : Int =  {
        if (n<=1) then 0
        else if (n>3) then fiboelem(n-1) + fiboelem(n-2) + fiboelem (n-3)
        else  1
    }
    
    def fibo(n:Int) : Unit  =  {
        if(n>0) then {
            fibo(n-1)
            print (fiboelem(n) + " ")
        }
    }
    def main(args: Array[String]) = {
        println ("¿Cuantos elementos?: ")
        val x = scala.io.StdIn.readInt()
        fibo(x)
    }
} 