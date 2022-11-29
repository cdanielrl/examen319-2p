import System.IO
import Data.Function (fix)

fibo :: Integer -> Integer
fibo n = fix (\f -> (\n -> if n<=1 then 0 else if n > 3 then f (n-1) + f (n-2) + f (n-3) else 1)) n

main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let n = read x :: Integer
    print ([fibo(y)| y <- [1..n]])