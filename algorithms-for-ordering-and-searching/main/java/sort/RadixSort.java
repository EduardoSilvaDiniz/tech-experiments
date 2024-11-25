public class RadixSort {

    // Função para encontrar o valor máximo no array
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Função Counting Sort para ordenação crescente
    public static void countingSortAsc(int[] array, int place) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Conta a ocorrência de cada dígito na posição atual
        for (int i = 0; i < n; i++) {
            int index = (array[i] / place) % 10;
            count[index]++;
        }

        // Converte contagem para posição cumulativa para ordenar em ordem crescente
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Constrói o array de saída colocando os elementos na ordem crescente
        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i] / place) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        // Copia os elementos ordenados de volta ao array original
        System.arraycopy(output, 0, array, 0, n);
    }

    // Função Counting Sort para ordenação decrescente
    public static void countingSortDesc(int[] array, int place) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Conta a ocorrência de cada dígito na posição atual
        for (int i = 0; i < n; i++) {
            int index = (array[i] / place) % 10;
            count[index]++;
        }

        // Converte contagem para posição cumulativa invertida para ordenar em ordem decrescente
        for (int i = 8; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        // Constrói o array de saída colocando os elementos na ordem decrescente
        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i] / place) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        // Copia os elementos ordenados de volta ao array original
        System.arraycopy(output, 0, array, 0, n);
    }

    // Função principal para Radix Sort em ordem crescente
    public static void radixSortAsc(int[] array) {
        int maxElement = getMax(array);

        // Aplica Counting Sort para cada dígito, começando da unidade
        for (int place = 1; maxElement / place > 0; place *= 10) {
            countingSortAsc(array, place);
        }
    }

    // Função principal para Radix Sort em ordem decrescente
    public static void radixSortDesc(int[] array) {
        int maxElement = getMax(array);

        // Aplica Counting Sort para cada dígito, começando da unidade
        for (int place = 1; maxElement / place > 0; place *= 10) {
            countingSortDesc(array, place);
        }
    }

    public static void main(String[] args) {
        int[] data = {121, 432, 564, 23, 1, 45, 788};

        // Ordenação em ordem crescente
        System.out.println("Array ordenado em ordem crescente:");
        radixSortAsc(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Redefine o array para a ordenação decrescente
        int[] dataDesc = {121, 432, 564, 23, 1, 45, 788};

        // Ordenação em ordem decrescente
        System.out.println("Array ordenado em ordem decrescente:");
        radixSortDesc(dataDesc);
        for (int num : dataDesc) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}