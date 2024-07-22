public class ConditionsExample {
  public static void main(String[] args) {

    int x = -17;
    int y = +12;

    if ((x < y) && (x % 2 == 0) && (y % 2 == 0)) {
      System.out.println("a");
    }

    if ((x == y) && (x < 0)) {
      System.out.println("b");
    }

    if ((x < y) || (x % 2 == 0)) {
      System.out.println("c");
    }

    if (((x <= 10) || (x >= 100)) && ((y >= 10) && (y <= 100))) {
      System.out.println("d");
    }

    if (!(x < 0) && !(y < 0)) {
      System.out.println("e");
    }

  }

}
