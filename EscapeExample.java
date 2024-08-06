public class EscapeExample {

  public static void main(String[] args) {
    
    //エスケープ文字を含む文字列を定義
    String input1 = "The price is $10.99. Do you agree?";
    String input2 = "The price is $10.99 today.";
    String input3 = "The price is 10.99 dollars.";

    //正規表現を定義
    String regex = "^.+\\$10\\.99.+$";

    //一致するか確認
    boolean result1 = input1.matches(regex);
    boolean result2 = input2.matches(regex);
    boolean result3 = input3.matches(regex);

    System.out.println("input1は正規表現に一致するか？" + result1);
    System.out.println("input2は正規表現に一致するか？" + result2);
    System.out.println("input3は正規表現に一致するか？" + result3);

  }
  
}
