import System.IO

main = do
    putStrLn "Ingrese la primera lista separada por espacios."
    lista1 <- getLine
    let as = map read (words lista1) :: [Int]
    putStrLn "Ingrese la segunda lista separada por cespacios."
    lista2 <- getLine
    let bs = map read (words lista2) :: [Int]
    let cs = filter (\x -> notElem x as) bs
    print bs
    if null cs then
        putStrLn "Es subconjunto de:"
    else
        putStrLn "NO es subconjunto de:"
    print as
      
