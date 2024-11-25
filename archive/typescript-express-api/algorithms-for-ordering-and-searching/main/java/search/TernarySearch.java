package main.java.search;

public class TernarySearch {
    public static void main(String[] args) {
        // O array deve estar ordenado
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 20, 20, 40, 64};
        int alvo = 20;

        // Chama a função de busca ternária para encontrar o elemento alvo
        int resultado = ternarySearch(numeros, 0, numeros.length - 1, alvo);

        // Verifica se o resultado não é -1 (elemento encontrado) e imprime o índice
        if (resultado != -1) {
            System.out.printf("Elemento %d encontrado no índice %d%n", alvo, resultado);
        } else {
            // Se o resultado for -1, o elemento não foi encontrado no array
            System.out.printf("Elemento %d não encontrado no array%n", alvo);
        }
    }

    public static int ternarySearch(int[] numeros, int esquerda, int direita, int alvo) {
        // Verifica se o limite esquerdo é menor ou igual ao limite direito
        if (esquerda <= direita) {
            // Calcula dois pontos médios dividindo o subarray atual em três partes iguais
            int meio1 = esquerda + (direita - esquerda) / 3;
            int meio2 = direita - (direita - esquerda) / 3;

            // Verifica se o alvo é igual a algum dos dois pontos médios
            if (numeros[meio1] == alvo) {
                return meio1; // Retorna o índice de meio1 se o alvo for encontrado
            }
            if (numeros[meio2] == alvo) {
                return meio2; // Retorna o índice de meio2 se o alvo for encontrado
            }

            // Se o alvo for menor que o elemento em meio1, busca no terço esquerdo do subarray
            if (alvo < numeros[meio1]) {
                return ternarySearch(numeros, esquerda, meio1 - 1, alvo);
            }
            // Se o alvo for maior que o elemento em meio2, busca no terço direito do subarray
            else if (alvo > numeros[meio2]) {
                return ternarySearch(numeros, meio2 + 1, direita, alvo);
            }
            // Se o alvo estiver entre meio1 e meio2, busca no terço do meio do subarray
            else {
                return ternarySearch(numeros, meio1 + 1, meio2 - 1, alvo);
            }
        }
        // Elemento não encontrado, retorna -1
        return -1;
    }
}
