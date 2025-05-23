const escola = "Cod3r"

console.log(escola.charAt(4))
console.log(escola.charAt(5)) // fora do escopo mas não gera erro
console.log(escola.charCodeAt(2)) // retorna o valor unicode da letra
console.log(escola.indexOf('3'))

console.log(escola.substring(1))
console.log(escola.substring(0, 3))

console.log('Escola'.concat(escola).concat("!"))
console.log(escola.replace(/\w/g, 'e')) // regex, tudo por e
console.log('ana,maria,pedro'.split(',')) // cria um array com o separador ","