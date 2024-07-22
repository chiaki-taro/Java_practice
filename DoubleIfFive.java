import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleIfFive {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("1つ目の整数を入力してください：");
      int num1 = scanner.nextInt();
      System.out.println("2つ目の整数を入力してください：");
      int num2 = scanner.nextInt();

      if (num1 == 5) {
        num1 = num1 * 2;
      }

      if (num2 == 5) {
        num2 = num2 * 2;
      }

      int sum = num1 + num2;

      System.out.println(sum);

    } catch (InputMismatchException e) {
      System.out.println("例外が発生しました：" + e.getMessage());
    } finally {
      scanner.close();
    }


  }

}
