### Lista de Atividades: Estrutura de dados 2  Professor Mayck Cipriano

## 1. Binary Search
[Binary Search](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/search/BinarySearch.java)
#### Por que a lista deve estar ordenada para que o Binary Search funcione corretamente
##### Exemplo com Lista Ordenada
Lista: `[1, 3, 5, 7, 9, 11]`  
Procurando o número **7**:
1. Escolha o elemento central: `5` (posição 3).
    - **7 > 5**, continue na metade direita: `[7, 9, 11]`.
2. Escolha o novo elemento central: `9`.
    - **7 < 9**, continue na metade esquerda: `[7]`.
3. O elemento central agora é `7`, e a busca termina.
##### Exemplo com Lista Não Ordenada
Lista: `[11, 3, 9, 1, 7, 5]` (não ordenada)  
Procurando o número **7**:
1. Escolha o elemento central: `9`.
    - **7 < 9**, continue na metade esquerda: `[11, 3, 9]`.
2. Mas nessa lista, os elementos à esquerda de `9` não são menores, logo, o algoritmo falha.
---
## 2. Interpolation Search
[InterpolationSearch](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/search/ExponentialSearch.java)
#### Comparação entre Interpolation Search e Binary Search

| **Lista**                   | **Algoritmo**            | **Tamanho da Lista** | **Intervalo de Elementos**              | **Tempo de Execução (ms)** | **Número de Comparações** |
| --------------------------- | ------------------------ | -------------------- | --------------------------------------- | -------------------------- | ------------------------- |
| Lista Ordenada Uniforme     | **Interpolation Search** | 1000                 | Uniforme (ex: 1, 2, 3, ..., 1000)       | 5 ms                       | 15                        |
| Lista Ordenada Uniforme     | **Binary Search**        | 1000                 | Uniforme (ex: 1, 2, 3, ..., 1000)       | 2 ms                       | 10                        |
| Lista Ordenada Não Uniforme | **Interpolation Search** | 1000                 | Não uniforme (ex: 1, 3, 7, 15, 30)      | 20 ms                      | 30                        |
| Lista Ordenada Não Uniforme | **Binary Search**        | 1000                 | Não uniforme (ex: 1, 3, 7, 15, 30)      | 4 ms                       | 15                        |
| Lista Ordenada Uniforme     | **Interpolation Search** | 5000                 | Uniforme (ex: 1, 2, 3, ..., 5000)       | 8 ms                       | 22                        |
| Lista Ordenada Uniforme     | **Binary Search**        | 5000                 | Uniforme (ex: 1, 2, 3, ..., 5000)       | 3 ms                       | 12                        |
| Lista Ordenada Não Uniforme | **Interpolation Search** | 5000                 | Não uniforme (ex: 1, 3, 7, 15, 30, ...) | 25 ms                      | 40                        |
| Lista Ordenada Não Uniforme | **Binary Search**        | 5000                 | Não uniforme (ex: 1, 3, 7, 15, 30, ...) | 6 ms                       | 18                        |


#### casos em que o Interpolation Search é mais eficiente que o Binary Search
##### Dados uniformemente distribuídos
O Interpolation Search assume que os dados seguem uma distribuição uniforme, permitindo que ele estime a posição do elemento desejado, saltando diretamente para a posição esperada.
##### Listas grandes
o Interpolation Search pode realizar menos comparações do que o Binary Search. graças ao calculo de estimativa da posição do elemento que esta sendo procurando.

---
## 3. Jump Search
[JumpSearch](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/search/JumpSearch.java)

---
## 4. Exponential Search
[ExponentialSearch](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/search/ExponentialSearch.java)

####  como Exponential search combina elementos do Jump Search e Binary Search
O Exponential Search encontra um intervalo de forma exponencial, similar aos 'saltos' do Jump Search. A cada iteração, o algoritmo verifica um índice  $2^n$ onde  *n* começa em 0 e aumenta a cada passo, ou seja, os índices que ele verifica são  1, 2, 4, 8, 16, ..., até encontrar um valor maior ou igual ao elemento procurado. Quando o intervalo onde o valor pode estar é encontrado, o algoritmo utiliza o Binary Search para buscar o elemento dentro desse intervalo e retorna o resultado.

---
## 5. Shell Sort
[ShellSort](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/sort/ShellSort.java)

#### Explique como a escolha da sequência de intervalos afeta a eficiência do algoritmo
A escolha da sequência de intervalos afeta a eficiência do algoritmo porque determina como ele percorre os dados e como ele decide em que parte da lista concentrar a busca.

---
## 6. Merge Sort
[MergeSort](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/sort/MergeSort.java)

#### Explique o conceito de "dividir para conquistar" usado nesse algoritmo
Dividir para conquistar" é uma técnica de resolução de problemas que envolve dividir um problema grande em subproblemas menores e mais fáceis de resolver.

---
## 7. Selection Sort
[SelectionSort](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/sort/SelectionSort.java)

#### demostração como a lista é organizada passo a passo.

| Iteração | Estado da Lista        | Ação Realizada                                             |
| -------- | ---------------------- | ---------------------------------------------------------- |
| 1        | `[64, 25, 12, 22, 11]` | Encontrar o menor valor (11), trocar com o primeiro valor. |
| 2        | `[11, 25, 12, 22, 64]` | Encontrar o menor valor (12), trocar com o segundo valor.  |
| 3        | `[11, 12, 25, 22, 64]` | Encontrar o menor valor (22), trocar com o terceiro valor. |
| 4        | `[11, 12, 22, 25, 64]` | Encontrar o menor valor (25), já está na posição correta.  |
| 5        | `[11, 12, 22, 25, 64]` | A lista já está ordenada.                                  |


---
## 8. Bucket Sort
[BucketSort](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/sort/BucketSort.java)

#### como os "baldes" são preenchidos e ordenados.
1. Preenchimento dos Baldes
    - O intervalo de elementos da lista é dividido em intervalos menores, e cada elemento é colocado em um balde correspondente.
    - Por exemplo, se os valores variam de 0 a 100 e decidimos usar 10 baldes, o primeiro balde conterá valores de 0 a 10, o segundo balde conterá valores de 11 a 20, e assim por diante.
    - O algoritmo distribui os elementos da lista original para os baldes, de acordo com seu valor.

2.  Ordenação de Cada Balde
    - Após o preenchimento, cada balde é ordenado separadamente. Frequentemente, um algoritmo de ordenação simples, como Insertion Sort, é usado para ordenar os elementos dentro de cada balde.
    - Se o número de elementos em cada balde for pequeno, a ordenação dentro do balde será eficiente.

1. Concorrência dos Baldes
    - Finalmente, após a ordenação dos baldes individuais, todos os baldes ordenados são concatenados para formar a lista final ordenada.

---
## 9. Radix Sort
[RadixSort](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/sort/RadixSort.java)

#### como o algoritmo lida com bases diferentes (ex.: base 10 e base 2)
O Radix Sort é um algoritmo de ordenação que lida com bases diferentes manipulando os dígitos ou bits de cada número. Ele ordena os elementos baseando-se na posição dos dígitos, da menor (menos significativa) para a maior (mais significativa). A base utilizada influencia a granularidade da divisão dos números.

| **Base**     | **Descrição**                  | **Número de Passadas**         | **Operações por Passada**    | **Uso Ideal**                               |
| ------------ | ------------------------------ | ------------------------------ | ---------------------------- | ------------------------------------------- |
| **Base 10**  | Dígitos de 0 a 9               | Depende do número de dígitos   | Comparações entre 10 grupos  | Melhor para números decimais grandes.       |
| **Base 2**   | Bits: 0 ou 1                   | Depende do número de bits      | Comparações entre 2 grupos   | Útil para dados binários ou grandes listas. |
| **Base 16**  | Dígitos hexadecimais: 0-9, A-F | Menos passadas que base 10     | Comparações entre 16 grupos  | Melhor para representações hexadecimais.    |
| **Base 256** | Bytes (0-255)                  | Uma passada por byte do número | Comparações entre 256 grupos | Ideal para grandes números ou strings.      |

---
## 10. Quick Sort
[QuickSort](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/sort/QuickSort.java)

---
## 11. Ternary Search
[TernarySearch](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/search/TernarySearch.java)

#### situações em que o Ternary Search seria mais eficiente que o Binary Search
- Funções unimodais contínuas
- Cenários de menor profundidade de recursão
- Listas de tamanho pequeno
- Custo computacional da divisão do intervalo

---
## 12. Comparação de Algoritmos de Busca

#### comparativa dos tempos de execução dos algoritmos de pesquisa em listas de tamanhos diferentes.
![[Lista para entregar_20241203090506522.webp|699]]

---
## 13. Comparação de Algoritmos de Ordenação

#### comparativa de tempo de execução e quantidade de comparação de todos os algoritmos de ordenação

##### Tempo (em milissegundos)

| Tamanho da Lista | Bubble Sort | Insertion Sort | Selection Sort | Shell Sort | Merge Sort | Quick Sort | Radix Sort | Bucket Sort |
|------------------|-------------|----------------|----------------|------------|------------|------------|------------|-------------|
| 1.000            | 44ms        | 11ms           | 12ms           | 2ms        | 1ms        | 3ms        | 2ms        | 1ms         |
| 3.000            | 232ms       | 10ms           | 10ms           | 9ms        | 1ms        | 1ms        | 6ms        | 2ms         |
| 6.000            | 191ms       | 34ms           | 17ms           | 2ms        | 3ms        | 9ms        | 9ms        | 3ms         |
| 8.000            | 313ms       | 48ms           | 30ms           | 4ms        | 4ms        | 1ms        | 3ms        | 4ms         |
| 10.000           | 456ms       | 75ms           | 47ms           | 5ms        | 5ms        | 1ms        | 4ms        | 4ms         |

##### Número de Comparações

| Tamanho da Lista | Bubble Sort | Insertion Sort | Selection Sort | Shell Sort | Merge Sort | Quick Sort | Radix Sort | Bucket Sort |
|------------------|-------------|----------------|----------------|------------|------------|------------|------------|-------------|
| 1.000            | 239,065     | 240,064        | 5,469          | 7,113      | 8,715      | 7,396      | 4,000      | 1,000       |
| 3.000            | 2,444,637   | 2,448,635      | 24,836         | 37,350     | 39,645     | 27,640     | 16,000     | 4,000       |
| 6.000            | 11,388,228  | 11,398,225     | 68,697         | 110,961    | 107,421    | 78,452     | 40,000     | 10,000      |
| 8.000            | 27,091,943  | 27,109,939     | 126,841        | 227,834    | 201,060    | 151,252    | 72,000     | 18,000      |
| 10.000           | 51,714,028  | 51,742,023     | 204,407        | 387,199    | 321,592    | 232,074    | 112,000    | 28,000      |

---
## 14. Análise de Complexidade

| Algoritmo            | Tempo (Melhor Caso) | Tempo (Pior Caso) | Espaço   |
| -------------------- | ------------------- | ----------------- | -------- |
| Binary Search        | O(log n)            | O(log n)          | O(1)     |
| Interpolation Search | O(log log n)        | O(n)              | O(1)     |
| Jump Search          | O(√n)               | O(√n)             | O(1)     |
| Exponential Search   | O(log n)            | O(log n)          | O(1)     |
| Shell Sort           | O(n log n)          | O(n^2)            | O(1)     |
| Merge Sort           | O(n log n)          | O(n log n)        | O(n)     |
| Selection Sort       | O(n^2)              | O(n^2)            | O(1)     |
| Bucket Sort          | O(n + k)            | O(n^2)            | O(n + k) |
| Radix Sort           | O(nk)               | O(nk)             | O(n + k) |
| Ternary Search       | O(log n)            | O(log n)          | O(1)     |
| Quick Sort           | O(n log n)          | O(n^2)            | O(log n) |

---

## 15. Busca e Ordenação em Strings
Adapte os algoritmos de ordenação (Merge Sort e Quick Sort) para ordenar palavras em ordem alfabética.
Utilize Binary Search para verificar se uma palavra específica está presente em uma lista de palavras ordenadas.
[SearchingAndSortingStrings](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/challenge/SearchingAndSortingStrings.java)

---

## 16. Aplicação Prática de Busca
Use o Binary Search para procurar um livro específico por ISBN em uma lista ordenada de registros de biblioteca.
[BinarySearchBooks](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/challenge/BinarySearchBooks.java)

---
## 17. Busca e Ordenação em Dados Reais
Implemente Bucket Sort para ordenar as notas de uma turma de alunos, classificadas entre 0 e 100. Em seguida, utilize o Interpolation Search para encontrar um aluno com uma nota específica
[SearchingAndSortingStrings](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/algorithms/challenge/SearchingAndSortingStrings.java)

---
## 18. Ordenação Estável e Instável

#### Algoritmos de Ordenação Estáveis

##### Estáveis
1. Merge Sort
   Entrada: (4,A),(3,B),(4,C),(1,D)(4, A), (3, B), (4, C), (1, D)  
   Saída: (1,D),(3,B),(4,A),(4,C)(1, D), (3, B), (4, A), (4, C)  
   Observação: Os valores 44 mantêm sua ordem relativa (AA antes de CC).
2. Bucket Sort
   Entrada: (3,A),(3,B),(1,C)(3, A), (3, B), (1, C)  
   Saída: (1,C),(3,A),(3,B)(1, C), (3, A), (3, B)  
   Mantém a ordem original dentro dos mesmos "baldes".
3. Radix Sort
   Entrada: (21,A),(13,B),(21,C)(21, A), (13, B), (21, C)  
   Saída: (13,B),(21,A),(21,C)(13, B), (21, A), (21, C)  
   Mantém a ordem relativa dos mesmos números ao processar os dígitos.

##### Não Estáveis
1. Quick Sort
   Entrada: (4,A),(3,B),(4,C)(4, A), (3, B), (4, C)  
   Saída: (3,B),(4,C),(4,A)(3, B), (4, C), (4, A)  
   Ordem relativa dos 44 não é preservada.
2. Shell Sort
   Entrada: (4,A),(3,B),(4,C)(4, A), (3, B), (4, C)  
   Saída: (3,B),(4,C),(4,A)(3, B), (4, C), (4, A)  
   Movimentos de elementos podem alterar a ordem relativa.
3. Selection Sort
   Entrada: (2,A),(2,B),(1,C)(2, A), (2, B), (1, C)  
   Saída: (1,C),(2,B),(2,A)(1, C), (2, B), (2, A)  
   A troca direta de valores quebra a ordem relativa.

##### Explicação Visual de Estabilidade
- Ordenação Estável (Merge Sort)
  Entrada: (4,A),(4,B)(4, A), (4, B)  
  Saída: (4,A),(4,B)(4, A), (4, B)
- Ordenação Não Estável (Quick Sort)
  Entrada: (4,A),(4,B)(4, A), (4, B)  
  Saída: (4,B),(4,A)(4, B), (4, A)
---
## 19. Análise Visual dos Algoritmos
- gráficos para ilustrar como os algoritmos de ordenação Quick Sort reorganizam os elementos a cada etapa.
  ![/../.github/quick_sort_step_by_step.webp]

---
## 20. Desafios de Implementação
[MainMenu](https://github.com/EduardoSilvaDiniz/tech-experiments/blob/main/algorithms-for-ordering-and-searching/main/java/tui/MainMenu.java)
Crie um programa que permita ao usuário escolher um algoritmo de busca e ordenação para ordenar uma lista ou procurar um elemento, oferecendo comparações automáticas entre os métodos.

