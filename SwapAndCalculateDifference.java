public class SwapAndCalculateDifference {

  public static void main(String[] args) {

    int x = 10;
    int y = 8;

    int[] replacement = toIntArray(x, y);

    x = replacement[1];
    y = replacement[0];

    x = x * 3;
    y = y * 2;

    int result = calculateDifference(x, y);

    System.out.println("result:" + result);

  }

  public static int calculateDifference(int num1, int num2) {
    return num1 - num2;
  }

  public static int[] toIntArray(int a, int b) {
    return new int[]{a, b};
  }

}
