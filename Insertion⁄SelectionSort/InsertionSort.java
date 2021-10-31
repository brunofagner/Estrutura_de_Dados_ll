class InsertionSort {
   int contOp = 0;

   int[] sort(int array[]) {
      int tamanho = array.length;
      for (int i = 1; i < tamanho; ++i) {
         int chave = array[i];
         int j = i - 1;
         contOp++;
         while (j >= 0 && array[j] > chave) {
            contOp++;
            array[j + 1] = array[j];
            contOp++;
            j = j - 1;
         }
         array[j + 1] = chave;
         contOp++;
      }
      return array;
   }
}
