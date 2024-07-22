import java.util.Scanner;

public class InputAndDisplay {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("整数を入力してください：");
    int num = scanner.nextInt();

    System.out.println("入力された整数：" + num);

    scanner.close();

  }

}
