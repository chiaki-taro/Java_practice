public class AverageCalculator {

  public static void main(String[] args) {
    
    int num1 = 11;
    int num2 = 5;
    int result = calculateAverage(num1, num2);
    System.out.println(result);

  }

  public static int calculateAverage(int num1, int num2) {
    return (num1 + num2) / 2;
  }
  
}
