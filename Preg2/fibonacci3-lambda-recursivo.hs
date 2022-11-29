import System.IO
import Data.Function (fix)

main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let num = read x :: Integer
    print ([fix (\f -> (\n -> if n<=1 then 0 else if n > 3 then f (n-1) + f (n-2) + f (n-3) else 1)) n| n <- [1..num]])