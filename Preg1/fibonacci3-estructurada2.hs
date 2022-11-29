import System.IO

fiboelem :: Integer -> Integer -> Integer -> Integer -> Integer
fiboelem a b c x = do
    if x == 1 then a
    else if x == 2 then b
    else if x == 3 then c
    else if x > 3 then fiboelem b c (a+b+c) (x-1)
    else 0

fibo x = fiboelem 0 1 1 x

main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let n = read x :: Integer
    print ([fibo(y)| y <- [1..n]])