function imprimirSoma(a, b) {
    console.log(a + b)
}

imprimirSoma(2, 2)
imprimirSoma(2) // falta arg mas não gera erro, apenas retonar NaN
imprimirSoma(2, 2, 4,4,4,4,4,4,4,4,4) // é possivel passa mais args mas não sera usando

function imprimirSomaTratado(a, b = 1) { // b tem um valor default, caso não seja passado nem um valor
    return a + b // não é necessario coloca o tipo de retorno
}

console.log(imprimirSomaTratado(2))