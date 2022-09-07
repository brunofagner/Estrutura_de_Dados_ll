public class SelectionSort {
      long contOp = 0;
      long contMov = 0;
      int[] sort(int array[]) {
          int n = array.length;

          for (int i = 0; i < n - 1; i++) {
              contOp++;
              int min = i;
   
              for (int j = i + 1; j < n; j++) {
                  if (array[j] < array[min]) {
                      min = j;
                      contOp++;
                  }
                  contOp++;
              }
   
              int temp = array[min];
              contOp++;
              array[min] = array[i];
              contOp++;
              array[i] = temp;
              contOp++;
              contMov++;
          }
          return array;
      }
   }