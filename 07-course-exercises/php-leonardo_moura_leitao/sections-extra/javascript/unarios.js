let num1 = 1
let num2 = 2

num1++
console.log(num1)
console.log(--num1) // é igual a num1-- ; console.log(num1)

console.log(++num1 === num2--) // não misture operadores aritmeticos com logicos, não é uma boa pratica, separe os operadores e torne o codigo mais simples

// exemplo simples de refaturação
let primeiroValor = 1
let segundoValor = 2

primeiroValor++
console.log(primeiroValor === segundoValor)
segundoValor--

console.log(primeiroValor === segundoValor)
