// Armazenando uma funcao em uma variavel
const imprimirSoma = function (a, b) {
    console.log(a + b)
}

imprimirSoma(2,3)

// Armazenando uma funcao arrow em uma variavel
const soma = (a, b) => {
    return a + b
}

console.log(soma(1,3))

// retorno implicito
const subtracao = (a, b) => a - b
const test = a => a - 1

console.log(subtracao(2,2))
console.log(test(10))