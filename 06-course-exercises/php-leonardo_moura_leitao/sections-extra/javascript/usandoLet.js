let numero = 1
console.log('antes =', numero)
{
    let numero = 2
    console.log('dentro =', numero)
}
console.log('fora =', numero)

{
    let numero2 = 2 // não foi utilizada
    console.log('dentro =', numero) // utilizou a var de fora!
}
console.log('fora =', numero)

/* let respeita o escopo de objeto, 
 * dentro do bloco foi criando uma var com o mesmo nome e utilizada, 
 * caso não existisse, seria usando a do escopo externo.
 * 
 * var não foi substituida por let pois isso causaria muitos problemas em diversos sistemas
 * por isso foi criado uma nova forma de criar variaveis, mas a recomedação é sempre utilizar let.
*/