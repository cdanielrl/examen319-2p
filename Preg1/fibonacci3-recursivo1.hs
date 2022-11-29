import System.IO

fiboelem :: Integer -> Integer
fiboelem 1 = 0
fiboelem 2 = 0
fiboelem 3 = 1
fiboelem n = fiboelem ( n-1 ) + fiboelem ( n-2 ) + fiboelem ( n-3 )

main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let n = read x :: Integer
    print ([fiboelem(y)| y <- [1..n]])