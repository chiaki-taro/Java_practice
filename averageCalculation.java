public class averageCalculation {
  public static void main(String[] args) {
    int[] scores = {71, 85, 92, 45, 100};
    
    int sum = 0;
    for(int score : scores) {
      sum += score;
    }

    double average = (double)sum / scores.length;
    System.out.println(average);
  }
  
}