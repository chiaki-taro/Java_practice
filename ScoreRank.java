import java.util.Scanner;

public class ScoreRank {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("得点を入力してください");
        int score = scanner.nextInt();
        
        if (score == 100) {
            System.out.println("完璧なスコア！A+");
        } else if (score == 0) {
            System.out.println("努力が必要です。F");
        } else if (score >= 90) {
            System.out.println("A");
        } else if( score >= 80){ 
            System.out.println("B");
        } else if( score >= 70){ 
            System.out.println("C");
        } else if( score >= 60){ 
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        
        scanner.close();
    
  }
  
}
