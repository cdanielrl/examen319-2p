import System.IO
import Data.Array

fibo    :: Integer -> Array Integer Integer
fibo n  =  a  where a = array (0,n) ([(0, 0), (1, 1), (2,1)] ++ 
                                     [(i,  a!(i-3) + a!(i-2) + a!(i-1)) | i <- [3..n]])
main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let n = read x :: Integer
    print(fibo (n-1))