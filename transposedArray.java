public class transposedArray {
  public static void main(String[] args) {
    int[][] numbers = {
      {1, 2, 3},
      {4, 5, 6}
    };

    // 元の行列の行数と列数を取得
    int lineCount = numbers.length;
    int columnCount = numbers[0].length;

    int[][] transposition = new int[columnCount][lineCount];

    for (int i = 0; i < lineCount; i++) {
      for (int j = 0; j < columnCount; j++) {
          transposition[j][i] = numbers[i][j];
      }
    }

    for (int i = 0; i < transposition.length; i++) {
      for (int j = 0; j < transposition[i].length; j++) {
          if (j != transposition[i].length - 1) {
              System.out.print(transposition[i][j] + " ");
          } else {
              System.out.println(transposition[i][j]);
          }
      }
    }
  }
}
