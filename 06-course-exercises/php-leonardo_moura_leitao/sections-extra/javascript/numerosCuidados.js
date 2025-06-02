console.log(7 / 0) // infinity
console.log(7 / 0.00000001) // 7 vai aumentar
console.log("10" / 2) // 10 é convertido para Number antes da operação
console.log('4' + 2) // o operador mais vai concatenar, string tem mais prioridade
console.log('4' - 2) // o operador menos por só fazer sentido no contexto de calculo, o 4 é convertido para Number
console.log("Show!" * 2) // não gera erro mas não é concluido a operação
console.log(0.1 + 0.7) // ponto flutuante proximo ao valor real
//console.log(10.toString()) o valor precisa ser protegido por ()
console.log((10).toString())