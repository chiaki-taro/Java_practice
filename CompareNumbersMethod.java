public class CompareNumbersMethod {
  public static void main(String[] args) {

    int x = 8;
    int y = 5;
    String result = null;

    if (x > y) {
      result = "x";
    } else if (x < y) {
      result = "y";
    } else {
      result = "xy";
    }

    System.out.println(result);

  }
}
