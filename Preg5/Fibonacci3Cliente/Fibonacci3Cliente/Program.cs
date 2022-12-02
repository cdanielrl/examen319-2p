using System.Net.Http.Headers;
using System.Text.Json;

using HttpClient client = new();

Console.WriteLine("¿Numero de Elementos?");
String n;
n = Console.ReadLine();

var estructurado = ClienteAsync(client, "http://localhost:5056/estructurado/" + n);
var recursivo = ClienteAsync(client, "http://localhost:5056/recursivo/" + n);
Console.WriteLine("Resultado de consulta recursiva");
Console.WriteLine(recursivo);
Console.WriteLine("Resultado de consulta estructurada");
Console.WriteLine(estructurado);

static async Task<String> ClienteAsync(HttpClient client,String url)
{
    await using Stream stream =
        await client.GetStreamAsync(url);
    var resultado =
        await JsonSerializer.DeserializeAsync<String>(stream);
    return resultado;
}



