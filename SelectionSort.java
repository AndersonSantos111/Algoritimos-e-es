public class SelectionSort implements Ordenador {

  @Override
  public int[] ordenar(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int indiceMenor = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[indiceMenor]) {
          indiceMenor = j;
        }
      }

      int temp = array[i];
      array[i] = array[indiceMenor];
      array[indiceMenor] = temp;
    }
    return array;
  }

  @Override
  public String getNome() {
    return "Selection Sort";
  }

}
