const saudacao = 'Opa' // contexto léxico 1

function exec() {
  const saudacao = 'falaa' // contexto léxico 2
  return saudacao
}

const client = {
  nome: 'Pedro',
  idade: 32,
  peso: 90,
  endereco: {
    logradouro: 'Rua muito legal',
    numero: 123
  }
}

console.log(saudacao)
console.log(exec())
console.log(client)
