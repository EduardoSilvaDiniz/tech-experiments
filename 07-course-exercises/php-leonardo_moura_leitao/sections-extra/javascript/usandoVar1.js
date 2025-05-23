{
    {
        {
            var sera = 'Será???' // mesmo estando dentro de 3 chaves, ainda continua no escopo global
        }
    }
}

console.log(sera)

function hello() {
   var local = 10
   return local 
}

console.log(hello())
//console.log(local) // não é possivel acessa a var criada na função pois é de escopo local, vars de escopo local só dentro de funcoes