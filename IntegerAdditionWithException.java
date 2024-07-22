import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerAdditionWithException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("１つ目の整数を入力してください: ");
            int x = getInt(scanner);
            System.out.print("２つ目の整数を入力してください: ");
            int y = getInt(scanner);

            int sum = x + y;
            
            System.out.println("合計: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("例外が発生しました:" + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int getInt(Scanner scanner) throws InputMismatchException {
        return scanner.nextInt();
    }

}
