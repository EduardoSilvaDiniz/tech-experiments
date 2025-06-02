console.log(typeof Object)
console.log(typeof new Object)

const Cliente = function() {}
console.log(typeof Cliente)
console.log(typeof new Cliente)

class Produto {}
console.log(typeof Produto)
console.log(typeof new Produto()) 

/* assim como em java, ao utilizar `new` estamos instanciando um objeto, objeto daquela classe
 * aqui no js, class é função e função (é claro) tambem é, logo podemos instancias uma função, 
 * mesmo isso não fazendo sentido no contexto de OOP. js é estranho!
 */