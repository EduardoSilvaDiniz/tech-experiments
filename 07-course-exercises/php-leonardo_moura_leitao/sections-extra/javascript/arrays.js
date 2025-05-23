const valores = [9,12,13,14,15]
console.log(valores[5] || "não existe")
console.log(valores.length)

valores.push({id: 3}, false, null, 'teste') // é possivel misturar tipos diferentes mas não é uma boa pratica
console.log(valores)

console.log(valores.pop()) // remove e retorna o ultimo elemento
delete valores[0] // deleta o dado mas não cria uma nova array
console.log(valores)

console.log(typeof valores) // toda array é um objeto

