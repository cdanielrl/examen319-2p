fiboelem = lambda n: 0 if n == 0 else 1 if n == 1 else 1 if n == 2 else fiboelem(n-1)+fiboelem(n-2)+fiboelem(n-3)

n=input("¿Cuantos elementos?: ")
n=int(n)
for i in range(0,n):
    print(fiboelem(i))