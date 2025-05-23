// criação de variaveis
var a = 3  // antiga
let b = 6.40 // moderna
const pi = 3.14 // imutavel

a = 10; b = 40; console.log(a, b)
// pi = 99; console.log(pi) ERROR, não é possivel mudar const
// utilizar cost é mais seguro que let ou var

/* função simples que 'printa' a variavel input */
function Hello(input) {
    console.log(input)
}

Hello(a)


