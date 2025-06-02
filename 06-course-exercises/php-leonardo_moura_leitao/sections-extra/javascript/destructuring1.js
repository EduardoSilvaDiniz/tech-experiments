// novo recurso do ES2015

const pessoa = {
  nome: 'Ana',
  idade: 5,
  endereco: {
    logradouro: 'Rua ABC',
    numero: 1000
  }
}

const { nome, idade } = pessoa // extrai informações do objeto
console.log(nome, idade)

const { nome: n, idade: i } = pessoa // renomea a variavel
console.log(n, i)

const { sobrenome, bemHumorada = true } = pessoa // seta um valor default caso não encontre a chave
console.log(sobrenome, bemHumorada)

const { endereco: { logradouro, numero, cep } } = pessoa
console.log(logradouro, numero, cep)

const { endereco } = pessoa // cria um objeto 
console.log(endereco)

// const { login: { login, senha } } = pessoa // não é possivel extrair dados de um objeto que não existe
// console.log(login, senha)
