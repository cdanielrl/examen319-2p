import System.IO

fiboelem :: Integer -> Integer
fiboelem x = do
    if x == 1 then 0
    else if x == 2 then 1
    else if x == 3 then 1
    else if x > 3 then fiboelem ( x-1 ) + fiboelem ( x-2 ) + fiboelem ( x-3 )
    else 0


main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let n = read x :: Integer
    print ([fiboelem(y)| y <- [1..n]])