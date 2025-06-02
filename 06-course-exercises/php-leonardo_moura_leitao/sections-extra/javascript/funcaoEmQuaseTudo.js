console.log(typeof Object) // Object não é um tipo de dado é uma função

const up = texto => texto.toUpperCase() // variaveis tambem podem ser funçoẽs

console.log(typeof up)

class Cell {
    hello() {
        console.log("hello")
    }
}
const test = new Cell()

console.log(typeof Cell) // classe tambem é função
console.log(typeof test.hello) // metodos são funções



// a classe é uma função, o metodo é função
// function -> function 

// js é contruido em funções, logo função é o assunto mais imporante do javascript