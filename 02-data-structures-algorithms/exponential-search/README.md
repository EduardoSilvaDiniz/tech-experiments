criado por [jon Bentley](https://en.wikipedia.org/wiki/Jon_Bentley_(computer_scientist)) e [Andrew Chi-Chih Yao](https://en.wikipedia.org/wiki/Andrew_Chi-Chih_Yao) em 1976, para buscar em listas ordenadas, ilimitadas/infinitas. Existem inúmeras manerias de implementar isso, sendo a mais comum determinar um intervalo em que a chave de busca reside e realizar uma [Busca binária](https://en.wikipedia.org/wiki/Binary_search) dentro desse intervalo. isso leva O(log i) onde i é a posição da chave de busca na lista, se a chave de busca estiver na lista, ou a posição onde a chave de busca deveria estar, se a chave de busca não estiver na lista.

A busca exponencial permite a busca em uma lista ordenada e ilimitada por um valor de entrada especifico. O algoritmo consiste em dois estágios, O primeiro estágio determina um intervalo no qual a chave de busca residiria se estivesse na lista. No segundo estágio, uma busca binária é realizada neste intervalo. No primeiro estágio assumindo que a lista está ordenada em ordem crescente, o algoritmo procura o primeiro expoente, j, onde o valor $2^j$ é maior que a chave de busca. este valor, $2^j$ se torna o limite superior (máximo) para a busca binária com a potência anterior de 2, $2^{j-1}$, sendo o limite inferior (minimo) para busca binária. 

Primeiro estágio
```c
int j = 1; 
  while (j < size && list[j] < key)
    j *= 2; // 2^j+1
```
Segundo estágio
```c
binarySearch(list, value, min(j, size_list), j / 2); // j/2 == 2^j-1
```

## Desempenho
o primeiro estagio do algoritmo leva tempo big O $log(i)$ onde *i* é o Índice onde a chave de busca estaria na lista. isso ocorre porque, ao determina o limite superior para a busca binária, o loop while é executado exatamente $[log(i)]$ vezes. como a lista está classificada após duplicar o índice de pesquisa $[log(i)]$ vezes, o algoritmo estará em um índice de pesquisa maior ou igual a *i* como $2^{\log(i)}\geq i$. como tal, o primeiro estágio do algoritmo leva tempo O (Log *i*).

a segunda parte do algoritmo também leva tempo O(log *I*). como a segunda estágio é simplesmente uma busca binária, ele leva o (log *n*) onde *n* é o tamanho do intervalo sendo buscando. o tamanho desse intervalo seria $2^j - 2^{j^{-1}}$  onde, como visto acima, j = log i. isso significa que o tamanho do intervalo sendo buscando é $2^{log(i)} - 2^{log(i^{-1})} = 2^{log(i^{-1})}$. isso nos dá um tempo de execução de log($2^{log(i^{-1})}$)=log(i) -1 = O (log i).

isso dá ao algoritmo um tempo de execução total, calculado pela soma dos tempos de execução dos dois estágios, de _O_ (log  _i_ ) + _O_ (log  _i_ ) = 2 _O_ (log  _i_ ) = _O_ (log  _i_ ).
### Tabela da função exponencial
Quanto maior for o X, maior será o limite, exemplo, X=7, incide = 128 /2 = 64 valores!

| X   | índice |
| --- | ------ |
| 0   | 1      |
| 1   | 2      |
| 2   | 4      |
| 3   | 8      |
| 4   | 16     |
| 5   | 32     |
| 6   | 64     |
| 7   | 128    |
| 8   | 256    |
| 9   | 512    |
| 10  | 1024   |
