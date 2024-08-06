public class RegexExample {

	public static void main(String[] args) {
		//正規表現を定義
		String regex = "[0-9]+"; //数字の1つ以上の連続を表す
		
		//文字列を検証する対象
		String input1 = "12345";
		String input2 = "abcde";
		
		//matchesメソッドを使用して正規表現に一致するか検証
		boolean result1 = input1.matches(regex);
		boolean result2 = input2.matches(regex);
		
		//結果を出力
		System.out.println(result1);
		System.out.println(result2);

	}

}