public class PowerOfThree {

    public static void main(String[] args) {

      int result = 1;

        for (int i = 1; i <= 2; i++) {

            int tempResult = 0;

            for (int j = 1; j <= 3; j++) {
                tempResult += result;
            }

            result = tempResult;

        }

        System.out.println(result);

    }

}
