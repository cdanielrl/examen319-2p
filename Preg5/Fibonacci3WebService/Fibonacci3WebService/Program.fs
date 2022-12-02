open System
open Microsoft.AspNetCore.Builder
open Microsoft.Extensions.Hosting
open System.Text.Json
open System.Threading.Tasks
open System.Net.Http
open System.Web
open Microsoft.AspNetCore.Http


let rec fiboRecursivoElem n =
    match n with
    | 0 -> 0
    | 1 -> 1
    | 2 -> 1
    | _ -> fiboRecursivoElem (n-1) + fiboRecursivoElem (n-2) + fiboRecursivoElem (n-3)

let rec fiboRecursivo n =
    let r = Array.create n ""
    for i = 0 to n - 1 do
        Array.set r i (fiboRecursivoElem(i).ToString())
    JsonSerializer.Serialize r


let fiboEstructurado n =
    let mutable a=0
    let mutable b=1
    let mutable c=1
    let mutable f=0
    let r = Array.create n ""
    for i = 0 to n - 1 do
        match i with
        | 0 -> f <- 0
        | 1 | 2 -> f <- 1
        | _ -> f <- a+b+c
               a <- b
               b <- c
               c <- f
        Array.set r i (f.ToString())
    JsonSerializer.Serialize r

[<EntryPoint>]
let main args =
    let builder = WebApplication.CreateBuilder(args)
    let app = builder.Build()

    app.MapGet("/", Func<string>(fun () -> "/recursivo o /estructurado")) |> ignore
    app.MapGet("/recursivo/{n}", Func<string>(fun n ->  fiboRecursivo 20)) |> ignore
    app.MapGet("/estructurado/{n}", Func<string>(fun n ->  fiboEstructurado 20)) |> ignore

    app.Run()

    0 // Exit code

