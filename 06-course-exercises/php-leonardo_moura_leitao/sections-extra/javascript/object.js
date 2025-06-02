// um objeto em js é uma coleção de chave e valor, igual ao hashtable chave -> valor
// objeto NÃO é JSON, são muito similares mas json é apenas texto enquanto objeto é codigo
const prod1 = {} // declaração de um objeto

prod1.nome = 'celular ultra mega' // 'nome' é a chave, declaração dinámica
prod1.preco = 4999.00
prod1['Desconto legal'] = 0.40 // evitar uso de espaço

console.log(prod1)
console.log(prod1.nome)
console.log(prod1.preco)

const prod2 = {
    nome: 'camisa',
    preco: 79.90,
    obj: { // é possivel ter objeto dentro de outro objeto
        blbl: 1,
        obj: {
            blbl: 2 // nomes iguais não causa problema desde que esteja em objetos diferentes
        }
    }
}

console.log(prod2)