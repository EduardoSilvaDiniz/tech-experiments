let valor // não inicializada
console.log(valor)

valor = null
console.log(typeof valor)

const produto = {}
console.log(produto.preco)
console.log(produto)

produto.preco = 3.50

console.log(!!produto.preco)
console.log(produto)

produto.preco = undefined // evite atribuir undefined, deixe que a linguagem lide com undefined
console.log(!!produto.preco)
console.log(produto)

produto.preco = null // forma correta de deixa o valor indefinido
console.log(!!produto.preco)
console.log(produto)

delete produto.preco // remove a chave 
console.log(!!produto.preco)
console.log(produto)