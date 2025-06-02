let isAtivo = false

isAtivo = true
console.log(isAtivo)

isAtivo = 1
console.log(!!isAtivo)

if (isAtivo) { // é possivel usar 1 e 0 no if
    console.log(!!isAtivo)
}

let nome = ""
//           false -- true
console.log( nome || "desconhecido") // se nome estiver vazio, retorna outra string

nome = "rodrigo"
//           true -- true
console.log( nome || "Desconhecido") // vai retonar o primeiro true