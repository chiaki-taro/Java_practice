public class EscapeExample {

  public static void main(String[] args) {
    
    //エスケープ文字を含む文字列を定義
    String input = "The price is $10.99. Do you agree?";

    //正規表現を定義
    String regex = "^.+\\$10\\.99.+$";

    //一致するか確認
    boolean result = input.matches(regex);

    System.out.println("inputは正規表現に一致するか？" + result);

  }
  
}
