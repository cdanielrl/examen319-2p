fiboelem = lambda a,b,c,n: a if n == 0 else b if n == 1 else c if n == 2 else fiboelem(b,c,a+b+c,n-1)

def fibo(n):
    for i in range(0,n):
        print(fiboelem(0,1,1,i))

n=input("¿Cuantos elementos?: ")
n=int(n)
fibo(n)
