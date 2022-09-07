class InsertionSort {
      long contOp = 0;
      long contMov = 0;
      int[] sort(int array[]) {
         int tamanho = array.length;
         for (int i = 1; i < tamanho; ++i) {
            int chave = array[i];
            int j = i - 1;
            contOp++;
            while (j >= 0 && array[j] > chave) {
               contMov++;
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