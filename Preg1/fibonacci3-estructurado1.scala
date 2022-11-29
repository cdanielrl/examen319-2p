object Fibonacci {
    
    def fibo(n:Int) : Unit  =  {
        var i=0
        var a=0
        var b=1
        var c=1
        var f=2
        for(i <- 0 until n) {
            i match
                case 0 => print ("0 ")
                case 1 => print ("1 ")
                case 2 => print ("1 ")
                case _ => { 
                    f=a+b+c
                    a=b
                    b=c
                    c=f
                    print (f + " ")
                }
        }
    }
    def main(args: Array[String]) = {
        println ("¿Cuantos elementos?: ")
        val x = scala.io.StdIn.readInt()
        fibo(x)
    }
} 