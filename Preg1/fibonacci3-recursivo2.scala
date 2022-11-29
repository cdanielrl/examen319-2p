object Fibonacci {
    def fibo3(a:Int,b:Int,c:Int,x:Int,n:Int) : Unit =  {
        if(x<=n) then {
            x match
                case 1 => print ((a)+ " ")
                case 2 => print ((b)+ " ")
                case 3 => print ((c)+ " ")
                case _ => print ((a+b+c)+ " ")
            if (x>3) {
                fibo3(b,c,a+b+c,x+1,n)
            } else {
                fibo3(a,b,c,x+1,n)
            }
        }
    }
    
    def fibo(n:Int) : Unit  =  {
       fibo3(0,1,1,1,n)
    }
    def main(args: Array[String]) = {
        println ("¿Cuantos elementos?: ")
        val x = scala.io.StdIn.readInt()
        fibo(x)
    }
} 