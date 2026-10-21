public class InsertionSort implements Ordenador {

  @Override
  public int[] ordenar(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int valor = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > valor) {
        array[j + 1] = array[j];
        j--;
      }
  
      array[j + 1] = valor;
    }
    return array;
  }

  @Override
  public String getNome() {
    return "Insertion Sort";
  }
  
}
