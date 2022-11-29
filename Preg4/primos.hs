import System.IO
import Data.Array.Unboxed

primesToA m = criba 3 (array (3,m) [(i,odd i) | i<-[3..m]]
                        :: UArray Integer Bool)
    where
    criba p a 
       | p*p > m   = 2 : [i | (i,True) <- assocs a]
       | a!p       = criba (p+2) $ a // [(i,False) | i <- [p*p, p*p+2*p..m]]
       | otherwise = criba (p+2) a

main = do
    putStrLn "¿Cuantos elementos?: "
    x <- getLine
    let n = read x :: Integer
    print (primesToA n)